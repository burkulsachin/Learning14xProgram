package ex_18_OOPs_Polymorphism.methodoverriding;

public class Lab0_146_MOverriding {
    static void main(String[] args) {
        Child c= new Child();
        c.home();

        // Father f1 = new Father();
        // f1.home();

        Father f2 = new Child(); // Dynamic Dispatch /
        f2.home();

        Father f= new Father();
        f.home();
    }
}
class  Father{
     void  home(){
         System.out.println("2BHK");
     }
}
class Child extends  Father{
    void home(){
        System.out.println("3BHK");
    }
}
