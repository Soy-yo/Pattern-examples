package structure.adapter;

public class Elephant {

  private String name;
  private String specie;
  private float weightPounds;

  public Elephant(String name, String specie, float weightPounds) {
    this.name = name;
    this.specie = specie;
    this.weightPounds = weightPounds;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSpecie() {
    return specie;
  }

  public float getWeightPounds() {
    return weightPounds;
  }

  public void setWeightPounds(float weightPounds) {
    this.weightPounds = weightPounds;
  }

}
