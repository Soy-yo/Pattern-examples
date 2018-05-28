package behaviour.interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InterpreterTest {

  @Test
  void test() {
    Operation op1 = new Number(6);
    Operation op2 = new Number(2);

    Operation add = new BinaryOperation(op1, Operator.ADD, op2);
    assertEquals(8, add.operate(), "Adds properly");

    Operation sub = new BinaryOperation(op1, Operator.SUB, op2);
    assertEquals(4, sub.operate(), "Subtracts properly");

    Operation mult = new BinaryOperation(op1, Operator.MULT, op2);
    assertEquals(12, mult.operate(), "Multiplies properly");

    Operation div = new BinaryOperation(op1, Operator.DIV, op2);
    assertEquals(3, div.operate(), "Divides properly");

    // Using same test because it's short
    ReversePolishNotationInterpreter interpreter =
        new ReversePolishNotationInterpreter("15 7 1 1 + - / 3 * 2 1 1 + + -");
    assertEquals(5, interpreter.interpret(), "Interpreter is working");
  }

}