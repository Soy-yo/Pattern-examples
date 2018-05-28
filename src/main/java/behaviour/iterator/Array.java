package behaviour.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Structure to iterate over. Default iterator is the usual iterator 0->n. It's not necessary to
 * implement Iterable for this pattern.
 *
 * @author Soy-yo
 */
public class Array<T> implements Iterable<T> {

  private ArrayList<T> elements = new ArrayList<>();

  public void add(T e) {
    elements.add(e);
  }

  public int size() {
    return elements.size();
  }

  @Override
  public Iterator<T> iterator() {
    return new ArrayIterator();
  }

  public Iterator<T> reversedIterator() {
    return new ReversedArrayIterator();
  }

  private class ArrayIterator implements Iterator<T> {

    private int index = 0;

    @Override
    public boolean hasNext() {
      return index < elements.size();
    }

    @Override
    public T next() {
      return elements.get(index++);
    }

  }

  private class ReversedArrayIterator implements Iterator<T> {

    private int index = elements.size();

    @Override
    public boolean hasNext() {
      return index > 0;
    }

    @Override
    public T next() {
      return elements.get(--index);
    }

  }

}
