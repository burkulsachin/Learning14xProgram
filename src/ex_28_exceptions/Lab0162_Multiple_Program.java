package ex_28_exceptions;

public class Lab0162_Multiple_Program {
    public static void main(String[] args) {
        int a=0;
         int b=0;
        try {
            int c= 10/a;
                String s =  null;
                s.trim();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
