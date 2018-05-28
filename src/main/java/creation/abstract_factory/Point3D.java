package creation.abstract_factory;

public class Point3D extends Point {

  public Point3D(int x, int y, int z) {
    super(new int[]{x, y, z});
  }

}
