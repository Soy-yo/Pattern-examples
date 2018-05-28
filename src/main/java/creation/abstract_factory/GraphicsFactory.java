package creation.abstract_factory;

/**
 * Factory that allows creation of different graphic elements depending on the dimension.
 * Not exactly Abstract Factory but kind of.
 *
 * @author Soy-yo
 */
public interface GraphicsFactory {

  Point createPoint(int... coordinates);

  Line createLine(Point source, Point destination);

}
