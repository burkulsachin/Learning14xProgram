package ex_21_Abstraction.superkeyword;

public class Lab0151 {
    public static void main(String[] args) {


 Son s= new Son();
 s.newHome();
 s.home();
    }
}
class Father{


        Father(){
            System.out.println("DC- PArent");
        }
    int gold =10;
        void home(){
            System.out.println("Home Father");
        }
}

class Son extends  Father{
    Son(){
    super();
    }
    int gold_c=10;
    void  bike (){

    }
    void  newHome(){
        System.out.println(super.gold);
        super.home();
        this.bike();
        System.out.println(this.gold_c);
    }
}