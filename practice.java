import java.util.Scanner;
public class practice {
    public static void main(String[] args){

      // 1D Array
      
      int [] num = new int[5];
      double sum = 0;
      int max = num[0];
      int min = num[0];
      Scanner input = new Scanner(System.in);

      System.out.println("Enter 5 number");

      for(int i = 0 ; i < num.length ; i++){
        num[i] = input.nextInt();
      }

      for(int i = 0 ; i < num.length ; i++){
        System.out.println("  " + num[i]);
        sum = sum + num[i];

        if(max < num[i]){
            max = num[i];
        }
        if(min > num[i]){
            min = num[i];
        }
      }

      System.out.println("Sum = " + sum);
      System.out.printf("max = %d\t  min = %d\n",max , min);
      

    //   2D Array

    int [][] arr = new int [2][3];
    Scanner input2 = new Scanner(System.in);

    System.out.println("Enter 2 X 3 matrix");

    for(int row = 0 ; row < 2 ; row++){
        for(int col = 0 ; col < 3; col++){
            arr[row][col] = input2.nextInt();
        }
    }

    for(int row = 0 ; row < 2 ; row++){
        for(int col = 0 ; col < 3; col++){
           System.out.print(' ' + arr[row][col]);
        }
       System.out.println();
    }


    // String 

     String s1 = "Rijoan Rashid Opar";
     String s2 = new String("RRO");
     
     System.out.println(s1 + s2.length());

     if(s1.contains(s2)){
        System.out.println("Equal");
     }else{
        System.out.println("not Equal");
     }


     String low = "Sonargaon University ";
     boolean start = low.startsWith("Son");
     boolean last = low.endsWith("eity");
     int pos = low.indexOf("a");
     System.out.println(low.toLowerCase());
     System.out.println(low.toUpperCase());
     System.out.println("pos = " + pos );

     System.out.println(start );
     System.out.print(last);

     String[] names = {"opar" , "rioan", "rashid"};
     for(int i = 0; i < 3 ; i++){
        System.out.println(names[i]);
     }





     int [] arrs = new int[5];
     
     Scanner get = new Scanner(System.in);

     System.out.println("enter Array");
     for(int i = 0 ; i < 5 ; i++){
        arrs[i] = get.nextInt();
     }
    
     for(int i = 0 ; i < 5 ; i++){
        System.out.println(arrs[i]);
     }
    
    }
}
