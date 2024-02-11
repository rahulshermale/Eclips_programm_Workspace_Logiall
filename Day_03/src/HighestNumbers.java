import java.util.Arrays;
import java.util.Scanner;

public class HighestNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a number: ");
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Highest 3 numbers:");
        for (int i = 9; i >= 7; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
