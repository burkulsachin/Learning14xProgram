package ex_11_Interiew_programs;

import java.util.Scanner;

public class Lab0096_Reverse_String_Char_Array {
    public static void main(String[] args) {
        System.out.println("Enter the input string i will reverse it");

        Scanner scanner=new Scanner(System.in);
        String user_input =scanner.next();

        String reverse_user_input ="";

        char[] arr = user_input.toCharArray();

        for(int i=user_input.length()-1;i>=0;i--){
            reverse_user_input=reverse_user_input+arr[i];

        }
        System.out.println(reverse_user_input);
    }
}
