package ex_10_StringBuilder_StringBuffer;

public class Lab0094_SB {
    public static void main(String[] args) {
        StringBuffer stringBuffer= new StringBuffer("Java");
        stringBuffer.append(" Programming");
        System.out.println(stringBuffer);

        stringBuffer.replace(0,4,"C++");
        System.out.println(stringBuffer);
    }
}
