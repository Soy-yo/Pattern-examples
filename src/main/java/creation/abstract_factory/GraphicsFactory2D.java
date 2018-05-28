package creation.abstract_factory;

public class GraphicsFactory2D implements GraphicsFactory {

  @Override
  public Point createPoint(int... coordinates) {
    return coordinates.length == 2 ? new Point2D(coordinates[0], coordinates[1]) : null;
  }

  @Override
  public Line createLine(Point source, Point destination) {
    return source instanceof Point2D ? new Line2D((Point2D) source, (Point2D) destination) : null;
  }

}
