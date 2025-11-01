package ex_17_OOPs_Part2_Inheritance.hierarchical;

public class Lab0142_Hierarchical {
    public static void main(String[] args) {
        Sachin s = new Sachin();
        s.child1();
        s.home();
        System.out.println("=========================");
        Archana a= new Archana();
        a.home();
        a.child3();
        System.out.println("=========================");

        Bhagyeshree b = new Bhagyeshree();
        b.home();
        b.child2();
    }
}
