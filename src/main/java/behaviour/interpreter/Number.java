package behaviour.interpreter;

public class Number implements Operation {

  private int value;

  public Number(int value) {
    this.value = value;
  }

  @Override
  public int operate() {
    return value;
  }

  @Override
  public String toString() {
    return "" + value;
  }

}
