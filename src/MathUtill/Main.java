package src.MathUtill;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner nm = new Scanner(System.in);
        System.out.println("Enter Your Number: ");
        double n = nm.nextDouble();
        // x3 + x2+ 1
        double res = Math.numCube(n) + Math.numSquare(n) + n;
        System.out.println(res);


        // * Swaping Thing
       System.out.print("Enter A: ");
       int a = nm.nextInt();
       System.out.print("Enter B: ");
       int b = nm.nextInt();

       Swap value = new Swap();
       value.swaping(a,b);

    }
}
