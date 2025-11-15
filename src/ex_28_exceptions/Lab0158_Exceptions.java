package ex_28_exceptions;

public class Lab0158_Exceptions {
    public static void main(String[] args) {
        System.out.println("Start");
        String ip = args[0];          //ArrayIndexOutOfBoundsException
        int a= Integer.parseInt(ip); //NumberFormatException
        int b= 100/a;   //ArithmeticException
        System.out.println(b);

        System.out.println("End ");
    }
}
