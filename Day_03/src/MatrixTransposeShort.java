import java.util.Scanner;

public class MatrixTransposeShort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[4][4];

        // Accept data for the matrix
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                matrix[i][j] = scanner.nextInt();

        // Calculate and display the transpose
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
}
