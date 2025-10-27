package ex_13_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Lab0102_Array_User_Inputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size =scanner.nextInt();

        String []arr = new String[size];

        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the element ->>"+i);
            arr[i]=scanner.next();


        }

        System.out.println("----- print the values -----");

        Arrays.sort(arr);
        for (String marks: arr){
            System.out.println(marks);

        }
    }
}
