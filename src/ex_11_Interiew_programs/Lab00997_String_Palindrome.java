package ex_11_Interiew_programs;

public class Lab00997_String_Palindrome {
    static void main(String[] args) {
        String str = "Sachin";
//         int len =str.length();
//        System.out.println(len);

        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
        if(rev.equalsIgnoreCase(str)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }

}
