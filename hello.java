import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        System.out.println("Rijoan Rashid Opar 2043 \t 01814482832");

        // Data Type
        double d = 70.5;
        boolean b = true;
        char ch = 'a';
        int i = 53;
        float f = 20.33f;

        System.out.println("d = " + d);
        System.out.println("b = "+ b);
        System.out.println("i = "+ i);
        System.out.println("f = "+ f);
        System.out.println("ch = "+ ch);

        // Formet specifier (use printf)
        // System.out.printf("b = %b\n", b);
        // System.out.printf("d = %f\n", d);
        // System.out.printf("i = %d\n", i);
        // System.out.printf("f = %f\n", f);
        // System.out.printf("c = %c\n", ch);

        // Take input from User
        int num1 ;
        String name ;
        double db ;
        Scanner input = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        Scanner dbl = new Scanner(System.in);
        char c;
        System.out.println("enter a num1");
        num1 = input.nextInt();
        System.out.println(num1);


        System.out.println("enter your name");
        name = str.nextLine();
        System.out.println("Welcome " + name);

        System.out.println("Enter Double Num2");
        db = dbl.nextDouble();
        System.out.println( db);
       
        // Operator
        double add, sub , mul , div;

        add = num1 + db;
        sub = num1 - db;
        mul = add * db;
        div = add / db;

        System.out.println("addition = " + add);
        System.out.println("subtraction = " + sub);
        System.out.println("multiple = " + mul);
        System.out.println("division = " + div);
        
        // Conditional operator

        if(num1 > 0){
            System.out.println("num1: Positive Number");
        }else if(num1 == 0){
            System.out.println("num1: Number is 0");
        }else{
            System.out.println("num1: Negitive number");
        }


       String res = (num1 % 2 == 0) ? "num1 : EVEN" : "num1: ODD";

       System.out.println(res);
       
        System.out.println("enter any character");
        c = str.next().charAt(0);
        System.out.println(c);


        // Logical Operator

        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
        {
            System.out.println("Its a vowel ");
        }else{
            System.out.println("its not vowel");
        }

        if(c >= 'a' && c <= 'z'){
          System.out.println("Its a vowel ");
        }else{
            System.out.println("its not vowel");
        }
    }
}
