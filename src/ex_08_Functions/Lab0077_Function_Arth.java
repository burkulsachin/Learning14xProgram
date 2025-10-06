package ex_08_Functions;

import java.util.Scanner;

public class Lab0077_Function_Arth {
    public static void main(String[] args) {
        // Create a Function of Sub, Sum, Mul and Div
        // with parameter, a, b (take the parameter from the User)

        // Logic Building
        // Step 1 -> Inputs and Outputs
        //  a, b - int -> Scanner
        //  int -> variable result ->


        // Step 2 - Rough logic -> Create functions
        // function -> type 4th - with return and with arguments/ parameters


        // Step 3 - Write the code and Find and Fix  -> Edge Cases
        Scanner scanner = new Scanner(System.in);
        int a= readInt(scanner,"Enter the num1");
        int b= readInt(scanner,"Enter the num2");

        int result_sum=sum(a,b);
        int result_sub=sub(a,b);
        int result_mul=mul(a,b);
        int result_div=div(a,b);
        int result_mod=mod(a,b);

        System.out.println("result_sum :"+ result_sum);
        System.out.println("result_sub :"+result_sub);
        System.out.println("result_mul :"+result_mul);
        System.out.println("result_div :"+result_div);
        System.out.println("result_mod :"+result_mod);





    }

    static int readInt(Scanner scanner, String prompt) {
        System.out.println(prompt);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Enter the integer only");
            System.exit(0);
            return 0;

        }
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int div(int a, int b) {

        if (b == 0) {
            throw new ArithmeticException("Division by 0 is not allowed");
        }
        return a / b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static int mod(int a, int b) {
        return a % b;
    }
}
