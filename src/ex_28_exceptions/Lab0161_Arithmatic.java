package ex_28_exceptions;

public class Lab0161_Arithmatic {
    public static void main(String[] args) {
         int c=0;
         int b=0;

        try {
            b=10/c;
        } catch (Exception e) {
            System.out.println("/0 not allowed ");
        }catch (Throwable e){
            System.out.println("/0 is strictly not allowed ");
        }
    }
}
