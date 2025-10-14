package ex_12_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Lab_0103_Array_User_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array(int)");
        int size = scanner.nextInt();

        String [] num_marks = new String[size];

        for(int i=0;i<num_marks.length;i++){
            System.out.println("enter the element -->>"+i);
            num_marks[i]= scanner.next();
        }
        System.out.println("prints the values");

        Arrays.sort(num_marks);
        for(String marks : num_marks){
            System.out.println(marks);
        }

    }
}
