package ex_23_innerclass;

public class Ex_2_Static_Nested_Class
    {
        public static void main(String[] args) {
            Outer1.Inner1 n=  new Outer1.Inner1();
            n.show();
    }
}

class Outer1 {
    static  int data=30;

    static class  Inner1{
        void  show(){
            System.out.println("Data is  "+data);
        }
    }
}
