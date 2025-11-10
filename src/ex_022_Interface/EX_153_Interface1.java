package ex_022_Interface;


interface  Animal{
    public void eat();
    public void travel();

}


public class EX_153_Interface1  implements  Animal{
    public void eat(){
        System.out.println("Mammal eat");
    }
    public void travel(){
        System.out.println("Mammal travel");
    }

   public static void main(String[] args) {
        EX_153_Interface1 e = new EX_153_Interface1();
        e.eat();
        e.travel();
    }

}