package ex_08_Functions;

public class Lab0073_Simple_Method {
    public static void main(String[] args) {
        non_return_type_function();
        String name = return_string_type_function();

        System.out.println(name);
    }

    static void non_return_type_function() {
        System.out.println("hi there, not return type function");
    }

    static String return_string_type_function() {
        System.out.println("hi there, i will return something");

        return "sachin";
    }

    static boolean return_boolean() {

        return true;
    }

    static float return_float_pi_value() {

        return 3.14f;

    }

    static byte byte_return_type() {

        return 100;

    }

    static long return_type_long() {

        return 1000l;

    }
}
