package ex_06_Loops;

import java.util.Scanner;

public class Lab0051_Sum_Of_Natural_Number {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <=n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

    }

}

