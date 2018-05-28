package behaviour.interpreter;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * Class that interprets an interpreter for reversed polish notation.
 *
 * @author Soy-yo
 */
public class ReversePolishNotationInterpreter {

  private static Map<String, Operator> operators = new HashMap<>();

  static {
    operators.put(Operator.ADD.toString(), Operator.ADD);
    operators.put(Operator.SUB.toString(), Operator.SUB);
    operators.put(Operator.MULT.toString(), Operator.MULT);
    operators.put(Operator.DIV.toString(), Operator.DIV);
  }

  private String[] tokens;
  private Deque<Operation> stack;

  public ReversePolishNotationInterpreter(String operation) {
    tokens = operation.split("\\s+");
    stack = new ArrayDeque<>();
  }

  public int interpret() {
    for (String s : tokens) {
      Operation op;
      try {
        int n = Integer.parseInt(s);
        op = new Number(n);
      } catch (NumberFormatException e) {
        Operation op2 = stack.pop();
        Operation op1 = stack.pop();
        op = new BinaryOperation(op1, operators.get(s), op2);
      }
      stack.push(op);
    }
    return stack.pop().operate();
  }

}
