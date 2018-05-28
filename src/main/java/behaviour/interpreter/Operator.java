package behaviour.interpreter;

/**
 * Not a pattern class but necessary for this example.
 *
 * @author Soy-yo
 */
public interface Operator {

  int operate(Operation left, Operation right);

  Operator ADD = new Operator() {
    @Override
    public int operate(Operation left, Operation right) {
      return left.operate() + right.operate();
    }

    @Override
    public String toString() {
      return "+";
    }
  };

  Operator SUB = new Operator() {
    @Override
    public int operate(Operation left, Operation right) {
      return left.operate() - right.operate();
    }

    @Override
    public String toString() {
      return "-";
    }
  };

  Operator MULT = new Operator() {
    @Override
    public int operate(Operation left, Operation right) {
      return left.operate() * right.operate();
    }

    @Override
    public String toString() {
      return "*";
    }
  };

  Operator DIV = new Operator() {
    @Override
    public int operate(Operation left, Operation right) {
      return left.operate() / right.operate();
    }

    @Override
    public String toString() {
      return "/";
    }
  };

}
