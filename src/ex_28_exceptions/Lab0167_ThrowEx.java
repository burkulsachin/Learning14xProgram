package ex_28_exceptions;

import java.util.Scanner;

public class Lab0167_ThrowEx {
    public static void main(String[] args) throws Exception {
        Scanner scanner  =new Scanner(System.in);
        int user_age= scanner.nextInt();
        validate_user_age_for_club(user_age);


    }
    static void validate_user_age_for_club(int age) throws Exception{
        if (age<25)
        {
            throw    new Exception("Age Cant be less than 25");
        }else{
            System.out.println("Enjoy Clubbing");
        }
    }
}
