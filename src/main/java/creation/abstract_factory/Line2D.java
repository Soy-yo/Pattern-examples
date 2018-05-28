package creation.abstract_factory;

public class Line2D extends Line {

  private Point2D source;
  private Point2D destination;

  public Line2D(Point2D source, Point2D destination) {
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
