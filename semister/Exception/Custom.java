package semister.Exception;

public class Custom {
    public class InnerCustom extends Exception {
        public InnerCustom(String message) {
            super(message);
        }
    
        public class Calculator{
            public static int divide(int a , int b) throws InnerCustom{
                if(b == 0){
                    throw new InnerCustom("Division by zero is not allowed");
                }
                return a / b;
            }
        }


        public static void main(String[] args) {
              try {
                int result = Calculator.divide(10, 0);
                System.out.println("Result: " + result);
              } catch (Exception e) {
                System.out.println(e.getMessage());
              }finally{
                System.out.println("Execution completed");
              }
        }
        
    }
}
