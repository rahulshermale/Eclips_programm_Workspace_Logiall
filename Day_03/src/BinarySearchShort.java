
import java.util.*;

public class BinarySearchShort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) arr[i] = scanner.nextInt();

        Arrays.sort(arr);

        int searchNum = scanner.nextInt();

        if (Arrays.binarySearch(arr, searchNum) >= 0) {
            System.out.println(searchNum + " is present in the array.");
        } else {
            System.out.println(searchNum + " is not present in the array.");
        }
    }
}
