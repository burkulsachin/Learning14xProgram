package ex_14_Interview_Programs_2;

public class Lab0113_RightAlignedTriangle {
    public static void main(String[] args) {
        int n=3;
        for (int i = 0; i < 3; i++) {
            for (int j = i; j < 3-1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
