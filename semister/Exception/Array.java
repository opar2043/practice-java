package semister.Exception;

public class Array {
    public static void main(String[] args) {
            try{
              int [] arr = {1,3,5};
              System.out.println(arr[5]);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array index is out of bounds");
            }finally{
                System.out.println("Execution completed");
            }
    }
}
