package structure.composite;

/**
 * Leaf element.
 *
 * @author Soy-yo
 */
public class Intern implements Worker {

  // Inners don't have salary either :D

  @Override
  public Worker getSubordinateAt(int index) {
    throw new UnsupportedOperationException("Inners don't have subordinates");
  }

  @Override
  public int getSubordinateCount() {
    throw new UnsupportedOperationException("Inners don't have subordinates");
  }

  @Override
  public void addSubordinate(Worker worker) {
    throw new UnsupportedOperationException("Inners don't have subordinates");
  }

  @Override
  public void removeSubordinate(Worker worker) {
    throw new UnsupportedOperationException("Inners don't have subordinates");
  }

  @Override
  public String work() {
    return "Here's your coffee sir";
  }

}
