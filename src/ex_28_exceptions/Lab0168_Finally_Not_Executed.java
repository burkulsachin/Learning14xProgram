package ex_28_exceptions;

import java.net.ServerSocket;

public class Lab0168_Finally_Not_Executed{
    public static void main(String[] args) {
        try{
            int a=10/10;
            System.out.println("Try Executed");
            System.exit(0);
        }catch (Exception e){
            System.out.println("Catch Executed");
        }finally {
            System.out.println("Finally Executed");
        }
    }

}
