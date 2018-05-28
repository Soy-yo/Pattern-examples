package structure.composite;

/**
 * Component of a composite tree. It represents a worker in a company hierarchy.
 *
 * @author Soy-yo
 */
public interface Worker {

  Worker getSubordinateAt(int index);

  int getSubordinateCount();

  void addSubordinate(Worker worker);

  void removeSubordinate(Worker worker);

  String work();

}
