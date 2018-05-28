package creation.abstract_factory;

public class Line3D extends Line {

  private Point3D source;
  private Point3D destination;

  public Line3D(Point3D source, Point3D destination) {
    this.source = source;
    this.destination = destination;
  }

  @Override
  public Point getSource() {
    return source;
  }

  @Override
  public Point getDestination() {
    return destination;
  }

}
