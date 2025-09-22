package ex_04_Ternary_Operator;

public class Lab0041_Real_Age_Classification {
    public static void main(String[] args) {
        String user_input = args[0];
        System.out.println(user_input);

        // input >> String

        System.out.println(user_input instanceof String );
//        String >>>>>int
        int age =Integer.parseInt(user_input);
//        String age = args[0];
//        String age = args[0];
        String result =age<18?"Minor": (age<60)?"Adult":"Sr.Citizen";
        System.out.println(result);
    }

}
