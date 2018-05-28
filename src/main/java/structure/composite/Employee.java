package structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite element.
 *
 * @author Soy-yo
 */
public class Employee implements Worker {

  private List<Worker> subordinates;
  private int salary;

  public Employee(int salary) {
    subordinates = new ArrayList<>();
    this.salary = salary;
  }

  @Override
  public Worker getSubordinateAt(int index) {
    return subordinates.get(index);
  }

  @Override
  public int getSubordinateCount() {
    return subordinates.size();
  }

  @Override
  public void addSubordinate(Worker worker) {
    subordinates.add(worker);
  }

  @Override
  public void removeSubordinate(Worker worker) {
    subordinates.remove(worker);
  }

  @Override
  public String work() {
    return "I have " + subordinates.size() + " subordinates";
  }

}
