package ex_08_Functions;

import java.util.Scanner;

public class Lab0074_User_Define_Functions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a");
        int a = scanner.nextInt();
        System.out.println("Enter b");
        int b = scanner.nextInt();
        int result = sum_of_two_number(a, b);
        System.out.println(result);
        // int result= sum_of_two_number(3,4);
        sum_of_two_number();
    }
    static int sum_of_two_number(int a, int b) {

        return a + b;
    }
    static void sum_of_two_number() {
        System.out.println("hi there ");
    }

}
