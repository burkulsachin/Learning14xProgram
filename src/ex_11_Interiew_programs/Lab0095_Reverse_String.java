package ex_11_Interiew_programs;

public class Lab0095_Reverse_String {
    public static void main(String[] args) {
        String str = "I have received the offer letter from the good company with salary 10 lakh PA";
//         int len =str.length();
//        System.out.println(len);

        String rev = "";

        for (int i = str.length()-1;i>=0;i--){

            rev=rev+str.charAt(i);
        }
        System.out.println(rev);
    }
}
