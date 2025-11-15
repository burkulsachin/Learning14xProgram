package ex_27_wrapper_classess;

public class Lab0157_WrapperExample {
    public static void main(String[] args) {
        int a=5;

        //Autoboxing-->>automatic conversion of primitive → wrapper
        Integer obj = a;
        System.out.println("Autoboxed Value "+ obj);

        //Unboxing – wrapper → primitive
        int b=obj;
        System.out.println("Unboxed Value"+b);

        // Using wrapper class methods
        int num = Integer.parseInt("100");
        System.out.println("Parsed value "+num );

    }
}


//        In Java, wrapper classes are objects that wrap (contain) primitive data types.
//They allow primitives to be used in places where objects are required—such as in collections
//        (e.g., ArrayList), generics, and various APIs.
