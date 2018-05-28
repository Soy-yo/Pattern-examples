package behaviour.interpreter;

public class BinaryOperation implements Operation {

  private Operation left;
  private Operator operator;
  private Operation right;

  public BinaryOperation(Operation left, Operator operator, Operation right) {
    this.left = left;
    this.operator = operator;
    this.right = right;
  }

  @Override
  public int operate() {
    return operator.operate(left, right);
  }

  @Override
  public String toString() {
    return left.toString() + operator.toString() + right.toString();
  }

}
