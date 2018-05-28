package creation.abstract_factory;

public class GraphicsFactory3D implements GraphicsFactory {

  @Override
  public Point createPoint(int... coordinates) {
    return coordinates.length == 3 ? new Point3D(coordinates[0], coordinates[1], coordinates[2]) :
        null;
  }

  @Override
  public Line createLine(Point source, Point destination) {
    return source instanceof Point3D ? new Line3D((Point3D) source, (Point3D) destination) : null;
  }

}