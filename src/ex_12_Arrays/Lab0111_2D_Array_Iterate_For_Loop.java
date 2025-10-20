package ex_12_Arrays;

public class Lab0111_2D_Array_Iterate_For_Loop {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5},
                {4, 3, 6},
                {56, 43, 54}
        };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " | ");

            }
            System.out.print("\n");

        }
    }
}