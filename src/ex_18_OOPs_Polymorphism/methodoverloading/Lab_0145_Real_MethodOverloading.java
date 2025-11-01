package ex_18_OOPs_Polymorphism.methodoverloading;

public class Lab_0145_Real_MethodOverloading {
    static void main(String[] args) {
        Home H = new Home();
        H.task();
        H.task("Cleaning Fan");
    }
}
class Home{

    void task(){
        System.out.println("Cleaning Task");
    }
    void task(String whichTask){
        System.out.println("Task : "+ whichTask);
    }
}
