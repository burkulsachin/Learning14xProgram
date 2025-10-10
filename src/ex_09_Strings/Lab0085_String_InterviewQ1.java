package ex_09_Strings;

public class Lab0085_String_InterviewQ1 {
    public static void main(String[] args) {

        String s1 = "sachin";
        String s4 = "Sachin";
        //String name3 = "sachin";


        String s2 = new String("Sachin");
        String s3 = new String("Sachin");
        String s5 = new String("sachin");

        // == -> Comparison -> String => this check the ref location
        System.out.println("s1 == s3 :"+s1 == s3);
        System.out.println("s1 == s2 :"+s1 == s2);
        System.out.println("s2 == s3 :"+s2 == s3);

        System.out.println("s1 == s4 :"+s1 == s4);
        System.out.println("s3 == s5 :"+s3 == s5);

        // equals ( content) -> value
        System.out.println("s1.equals(s2) : "+s1.equals(s2));


        System.out.println("s1.equals(s3) :"+s1.equals(s3));
        System.out.println("s3.equals(s5) :"+s3.equals(s5));
        System.out.println("s3.equalsIgnoreCase(s5) :"+s3.equalsIgnoreCase(s5));





    }
}
