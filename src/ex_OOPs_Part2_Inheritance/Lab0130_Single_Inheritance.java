package ex_OOPs_Part2_Inheritance;

public class Lab0130_Single_Inheritance {

    public static void main(String[] args) {


        Lab0129_Son sachin = new Lab0129_Son();
        System.out.println(sachin.gold_f);
        sachin.bhk2();
        sachin.bhk3();

        Lab0128_Father father = new Lab0128_Father();
        father.bhk2();
        //father.bhk3();

    }
}
