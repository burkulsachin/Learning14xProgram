package ex_10_StringBuilder_StringBuffer;

public class Lab0091_StringBuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer= new StringBuffer("Sachin ");

        stringBuffer.append("Burkul");
        System.out.println(stringBuffer);

        String s1= "Sachin";
        s1=s1+" Burkul";
        System.out.println(s1);


    }
}
