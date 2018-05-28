package structure.adapter;

/**
 * Adapter that adapts an elephant weight in pounds to a weight in kilograms.
 *
 * @author Soy-yo
 */
public class ElephantWeightAdapter implements WeighableKg {

  private Elephant elephant;

  public ElephantWeightAdapter(Elephant elephant) {
    this.elephant = elephant;
  }

  @Override
  public float getWeight() {
    return elephant.getWeightPounds() * .45f;
  }

}
