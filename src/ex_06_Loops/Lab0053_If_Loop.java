package ex_06_Loops;

public class Lab0053_If_Loop {
    public static void main(String[] args) {
        String user_input = args[0];
        System.out.println(user_input);
        int age =   Integer.parseInt(user_input);
        System.out.println(age);

        if(age>18){
            System.out.println("Yes you can Vote!");

        }else {
            System.out.println("You cant vote in india");
        }
    }
}
