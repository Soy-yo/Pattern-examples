package behaviour.iterator;

import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IteratorTest {

  @Test
  void test() {
    Array<Integer> array = new Array<>();
    // Array creation (using Integer instead of int because of assertEquals' type mismatch)
    Integer[] values = new Integer[]{1, 5, 8, -3};
    for (int n : values) {
      array.add(n);
    }
    int i = 0;
    for (Integer n : array) {
      assertEquals(values[i], n, "Iterable with enhanced for loop");
      i++;
    }

    Iterator<Integer> it = array.iterator();
    i = 0;
    while (it.hasNext()) {
      assertEquals(values[i], it.next(), "Iterator returns correct values");
      i++;
    }

    it = array.reversedIterator();
    i = array.size() - 1;
    while (it.hasNext()) {
      assertEquals(values[i], it.next(), "Reversed iterator returns correct values");
      i--;
    }
  }

}