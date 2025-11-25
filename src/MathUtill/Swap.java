package src.MathUtill;

public class Swap {
    public  void swaping(int a , int b){
        System.out.println("Before swap: A = " + a + ", B = " + b);
        int temp ;
        temp = a;
        a = b;
        b = temp;

        System.out.println("After swap: A = " + a + ", B = " + b);

    }
}
