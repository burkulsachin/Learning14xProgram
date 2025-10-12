package ex_10_StringBuilder_StringBuffer;

public class Lab0093_SB {
    public static void main(String[] args) {
        StringBuilder stringBuilder= new StringBuilder("Hello");
        stringBuilder.append(" World");
        stringBuilder.reverse();
        System.out.println(stringBuilder);

    }
}
