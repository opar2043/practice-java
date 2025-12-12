package semister.Exception;

public class Aritmetic {
    public static void main(String[] args) {
           try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println("Result: " + c);
           } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed");
           }finally{
            System.out.println("Execution completed" );
           }
    }
}
