package ex_10_StringBuilder_StringBuffer;

public class Lab0090_String_Functions {
    public static void main(String[] args) {
        String name = "Sachin";

        System.out.println(name.length());
        System.out.println(name.charAt(3));
        // System.out.println(name.charAt(10));//java.lang.StringIndexOutOfBoundsException: Index 10 ou
        //2.  concat()

        System.out.println(name.concat(" Burkul"));
        // 3. contains()
        System.out.println(name.contains("om"));

        // 4. equals()
        System.out.println(name.equals("Sachin"));

        // 5. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("sachin"));

        // 6. indexOf() //  sachin -> ? i
        System.out.println(name.indexOf('i'));


        String s1 = "madam";
        // Returns the index within this string of the
        // first occurrence of the specified substring.
        System.out.println(s1.indexOf("m"));


        // 7. length()
        System.out.println(name.length());

        // 8. replace( , )
        System.out.println(name.replace('n', 'N'));

        // 10. substring( , )
        System.out.println(name.substring(1, 3));


        // 11. toLowerCase()
        System.out.println("SACHIN".toLowerCase());

        // 12. toUpperCase()
        System.out.println("sachin".toUpperCase());


        // 14. startsWith()
        System.out.println(name.startsWith("S"));

        // 15. endsWith()
        System.out.println(name.endsWith("a"));


        // 16. trim()
        String name3 = "    Sachin Burkul     ";
        System.out.println(name3.trim());


        // 17. compareTo()
        System.out.println(name.compareTo("Sachin"));



        StringBuilder stringBuilder = new StringBuilder("Sachin");

        System.out.println(stringBuilder);

        stringBuilder.reverse();
        System.out.println(stringBuilder);

      //  StringBuilder sb = new StringBuilder("Hi

        StringBuilder sb = new StringBuilder("Hi");
        System.out.println(sb.toString());


    }
}
