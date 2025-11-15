package ex_28_exceptions;

public class Lab0160_Try_Catch {
    public static void main(String[] args) {
        String s =  null;

        try {
            s.trim();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
