import java.util.Scanner;

public class MatrixSumShort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];

        // Accept data for both matrices
        for (int[][] matrix : new int[][][] {matrix1, matrix2}) {
            System.out.println("Enter elements for a 3x3 matrix:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
        }

        // Calculate and display the sum of matrices
        System.out.println("Sum of the matrices:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix1[i][j] + matrix2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
