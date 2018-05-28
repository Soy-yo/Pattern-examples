package structure.composite;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CompositeTest {

  @Test
  void test() {
    // Not actually an employee but it's ok
    Worker ceo = new Employee(Integer.MAX_VALUE);

    List<Worker> subordinates = Arrays.asList(new Employee(10000), new Employee(9000));
    for (Worker w : subordinates) {
      ceo.addSubordinate(w);
    }

    Worker worker = ceo.getSubordinateAt(0);
    assertEquals(subordinates.get(0), worker, "Subordinates properly set");

    worker.addSubordinate(new Employee(2000));
    Worker poor = new Intern();
    worker.addSubordinate(poor);

    assertEquals("I have 2 subordinates", worker.work(), "Employees \"work\"");
    assertEquals(poor, ceo.getSubordinateAt(0).getSubordinateAt(1),
        "Subordinates properly chained");

    assertEquals("Here's your coffee sir", poor.work(), "Interns work too");

    assertThrows(UnsupportedOperationException.class, () -> poor.addSubordinate(ceo),
        "Interns can't have subordinates");
  }

}