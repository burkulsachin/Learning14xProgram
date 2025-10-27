package ex_14_Interview_Programs_2;

import java.util.Scanner;

public class Lab0112_2D_Reverse_Left_Triangle {
    public static void main(String[] args) {
        // left hand triangle pattern
        // // How the pattern we want
        //        //  n = 3
        //        // *
        //        // **
        //        // ***
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input value for the triangle");
        int n= scanner.nextInt();

         for (int i=1;i<=n;i++){
             for (int j=1;j<=i;j++){
                 System.out.print("*");
             }
             System.out.println();
         }


    }
}
