package ex_18_OOPs_Polymorphism;

public class Calculator {
    public static void main(String[] args) {
        calc c = new calc();
        c.add(2,4);


    }
}

class  calc{

    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    double add(double a, double b){
        return a+b;

    }

    long add (long a, long b){
        return a+b;

    }
}
