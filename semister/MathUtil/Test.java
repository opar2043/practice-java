package semister.MathUtil;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("enter you number: ");      
        double a = num.nextDouble();

        double result = MathFunc.cube(a) + MathFunc.secure(a) + a ;
        System.out.println("result: " + result);
        num.close();
    }
}
