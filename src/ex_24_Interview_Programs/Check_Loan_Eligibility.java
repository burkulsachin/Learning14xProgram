package ex_24_Interview_Programs;

import java.util.Scanner;

public class Check_Loan_Eligibility {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("enter age ");
        int age = sc.nextInt();
        System.out.println("enter salary ");
        double salary = sc.nextDouble();
        System.out.println("enter credit score ");
        int creditScore = sc.nextInt();

        // Validate input
        boolean isEligible = true;

        //age validation
        if (age <= 0) {
            System.out.println("Invalid age ");
            isEligible = false;
        } else if (age < 18) {
            System.out.println("Under age");
            isEligible = false;
        } else if (age > 80) {
            System.out.println("Over age ");
            isEligible = false;
        }

        if (salary <= 0) {
            System.out.println("Not valid salary ");
            isEligible = false;
        } else if (salary < 30000) {
            System.out.println("Salary must be 30000");
            isEligible = false;
        }

        if (creditScore <= 0) {
            System.out.println("Credit score must be positive");
            isEligible = false;
        } else if (creditScore < 650) {
            System.out.println("Credit Score Too low");
            isEligible = false;

        } else if (creditScore > 850) {
            System.out.println("invalid ! should not exceed 850");
            isEligible = false;
        }
        if (isEligible) {
            System.out.println("Congoooo! you are eligible for loan");
        } else {
            System.out.println("Sorry you are not eligible for loan");
        }
        sc.close();
    }
}
