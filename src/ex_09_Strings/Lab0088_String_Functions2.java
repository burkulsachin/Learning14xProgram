package ex_09_Strings;

public class Lab0088_String_Functions2 {
    public static void main(String[] args) {
        String s= "Java".substring(2);
        System.out.println(s);

        String s2="Java".substring(1,3);
        System.out.println(s2);

        char arr[] = "Java".toCharArray();
        System.out.println(arr); // ['J', 'a', 'v', 'a']

        String s3= "java ".trim();
        System.out.println(s3);

        boolean b= "  ".isBlank();
        System.out.println(b);

        String  a="ab ".repeat(6);
        System.out.println(a);

        boolean b2= "JAVA".equalsIgnoreCase("java");
        System.out.println(b2);

        long count ="a\nb\nc".lines().count();
        System.out.println(count);




    }
}
