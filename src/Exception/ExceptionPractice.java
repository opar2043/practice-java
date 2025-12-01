class InnerCalculator extends RuntimeException {

  InnerCalculator(String msg) {
    super(msg);
  }
}

class Calculator {
  // why i got error if i dont use static keyword. and why
 static double division(double a, double b) {
    if (b == 0) {
      System.out.println("\"Error: Division by Zero");
    }

    return a / b;
  }
}

public class ExceptionPractice {
  public static void main(String args[]) {
    try {
      double res = Calculator.division(10, 0);
      System.out.println("Result: " + res);
    } catch (InnerCalculator e) {
      System.out.println("Caught exception: " + e.getMessage());
    }
    System.out.println("Program continues after handling exception.");
  }
}
