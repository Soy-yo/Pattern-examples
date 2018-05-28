package creation.abstract_factory;

/**
 * Class representing a line in the space.
 *
 * @author Soy-yo
 */
public abstract class Line {

  public abstract Point getSource();

  public abstract Point getDestination();

  @Override
  public String toString() {
    return "line[" + getSource() + "," + getDestination() + "]";
  }

}
