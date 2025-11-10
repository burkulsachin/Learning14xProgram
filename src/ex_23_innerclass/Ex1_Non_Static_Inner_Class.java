package ex_23_innerclass;

public class Ex1_Non_Static_Inner_Class {
    public static void main(String[] args) {
        Outer o=new Outer();
        o.showInner();
    }
}
class Outer {
    private  String msg ="Hello from outer class";

    class  Inner{
        void  display(){
            System.out.println(msg);
        }
    }
    void  showInner(){
        Inner in= new Inner();
        in.display();
    }
 }