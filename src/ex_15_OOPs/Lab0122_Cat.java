package ex_15_OOPs;

public class Lab0122_Cat {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cat c2= new Cat("Lucy");
        Cat c3= new Cat("Spicy");
        c3.running();
        c2.running();

    }
}


    class Cat{
 String name;
        Cat(){
            name="Kitty";

        }
        Cat(String name){
           this.name=name;
        }
        void running (){
            int var =10 ;

            System.out.println( "Who is running  :"+ this.name );
        }
    }

