package ex_23_innerclass;

public class Ex_3_Local_Inner_Class {
    public static void main(String[] args) {
        Outer2 O= new Outer2();
        O.outerMethod();

    }
}
class Outer2{
    void outerMethod(){
        class  Inner2{
            void  display(){
                System.out.println("Inside Local Inner Class");
                }
            }
            Inner2 inner = new Inner2();
        inner.display();
        }
    }


