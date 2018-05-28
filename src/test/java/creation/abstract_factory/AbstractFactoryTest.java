package creation.abstract_factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AbstractFactoryTest {

  private GraphicsFactory getFactory(Space space) {
    return space.dimension == 2 ? new GraphicsFactory2D() : new GraphicsFactory3D();
  }

  @Test
  void test1() {
    Space space = new Space(2);
    GraphicsFactory factory = getFactory(space);
    Point p1 = factory.createPoint(0, 0);
    Point p2 = factory.createPoint(1, 1);
    Line line = factory.createLine(p1, p2);

    assertTrue(p1 instanceof Point2D, "Correct type");
    assertTrue(p2 instanceof Point2D, "Correct type");
    assertTrue(line instanceof Line2D, "Correct type");

    assertEquals("(0,0)", p1.toString(), "Correct representation");
    assertEquals("(1,1)", p2.toString(), "Correct representation");
    assertEquals("line[(0,0),(1,1)]", line.toString(), "Correct representation");
  }

}