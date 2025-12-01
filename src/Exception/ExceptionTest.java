// Custom exception class extending RuntimeException
class InnerExceptionTest extends RuntimeException {
    InnerExceptionTest(String msg) {
        super(msg);
    }
}

// Calculator class with a static division method
class Calculator {
    static double division(double a, double b) {
        if (b == 0) {
            throw new InnerExceptionTest("Error: Division by Zero");
        }
        return a / b;
    }
}

// Main class with main method
public class ExceptionTest {
    public static void main(String[] args) {
        try {
            double res = Calculator.division(13, 0); // This will throw the exception
            System.out.println("Result: " + res);
        } catch (InnerExceptionTest e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        System.out.println("Program continues after handling exception.");
    }
}
