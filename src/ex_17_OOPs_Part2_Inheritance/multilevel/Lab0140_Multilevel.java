package ex_17_OOPs_Part2_Inheritance.multilevel;

public class Lab0140_Multilevel {
    public static void main(String[] args) {
        Lab0139_Son s = new  Lab0139_Son();
        // Gradfather
        s.gf();
        s.home();
        //father
        s.extra();
        // own
        s.bhk3();

        Lab0138_Father f= new Lab0138_Father();
        // Own
        f.extra();
        //GF
        f.home();
        f.gf();

        Lab0137_Grandfather g = new Lab0137_Grandfather();
        //Own
        g.home();
        g.gf();

        //Dynamic Dispatch

        Lab0137_Grandfather g1 = new Lab0139_Son();
        Lab0138_Father f1 = new Lab0139_Son();
        //Son s1 = new GrandFather();
        //Son s2 = new Father();


    }
}
