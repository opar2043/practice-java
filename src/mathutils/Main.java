package src.mathutils;

import java.util.Scanner;

public class Main {
   public static void main(String[] args){
    Scanner num = new Scanner(System.in);
    System.out.print("Enter the x: ");
    double x = num.nextDouble();

    double res = MathOOP.cube(x) + MathOOP.square(x) + x;
    System.out.println("result: " + res);
   }
}


