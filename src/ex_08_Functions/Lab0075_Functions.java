package ex_08_Functions;

public class Lab0075_Functions {
    public static void main(String[] args) {
        //1

        wop_wor_greet();

        //2

        String msg = wop_wr_greet2();
        //3

        greet_with_details("sachin", 40, 100);
        //4
        int sum = sum_of_two_number(3,7);
        int sum2 = sum_of_three_numbers(4,5,3);
       // int sum3= sum_of_three_numbers(3.2,44.3,32.4);

    }

    // 1.Without Argument / Parameters and Without Return Type.
    static void wop_wor_greet() {
        System.out.println("Hi, Type 1 function");
        System.out.println("Hi there!!");
    }

    //2. Without Parameters but With Return Type
    static String wop_wr_greet2() {
        System.out.println("Hi, type 2 function");
        return "Hi,How are you";
    }
    //3. With Parameters and Without Return Type ( 90%)

    static void greet_with_details(String name, int age, double salary) {
        System.out.println("Your name is ->" + name + "\n your age is " + age + "\n your salary is " + salary);
    }

    //4. With Parameters and With Return Type
    static int sum_of_two_number(int a, int b) {
        System.out.println(" hi 4 type function");
        return a + b;
    }

    static int sum_of_three_numbers(int a, int b, int c) {
        return a + b + c;
    }

    static float sum_of_three_numbers(float a, float b, float c) {
        return a + b + c;
    }
}
