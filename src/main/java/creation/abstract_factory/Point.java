package creation.abstract_factory;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Class representing a point in the space.
 *
 * @author Soy-yo
 */
abstract class Point {

  public final int[] coordinates;

  protected Point(int[] coordinates) {
    this.coordinates = coordinates;
  }

  @Override
  public String toString() {
    return "(" + Arrays.stream(coordinates)
        .mapToObj(Integer::toString)
        .collect(Collectors.joining(",")) + ")";
  }

}
