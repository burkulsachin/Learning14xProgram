package ex_09_Strings;

public class Lab0089_String_Funs {
    public static void main(String[] args) {
        String s= "Java";
        char c= s.charAt(2);
        System.out.println(c);

        int result= "def".compareTo("DEF");
        System.out.println(result);

        int idx = "java".indexOf("a");
        System.out.println(idx);

        int idx2 ="Java".lastIndexOf("a");
        System.out.println(idx2);


        boolean bo = "".isEmpty();
        System.out.println(bo);

        String s11= String.join("-","Java"," with sachin");
        System.out.println(s11);

        String s12 = "Java".replace("a","o");
        System.out.println(s12);

        boolean b2= "java".startsWith("ja");
        System.out.println(b2);

        String b3 = "java".concat("Mava");
        System.out.println(b3);


    }
}
