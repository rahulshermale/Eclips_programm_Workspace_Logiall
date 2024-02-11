import java.util.*;

public class Q4_Accept_Two_Set {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array1 = new int[5];
        int[] array2 = new int[5];

        System.out.println("Enter elements for the first array:");
        for (int i = 0; i < 5; i++) array1[i] = scanner.nextInt();

        System.out.println("Enter elements for the second array:");
        for (int i = 0; i < 5; i++) array2[i] = scanner.nextInt();

        Arrays.sort(array1);
        Arrays.sort(array2);

        int[] mergedArray = new int[10];
        System.arraycopy(array1, 0, mergedArray, 0, 5);
        System.arraycopy(array2, 0, mergedArray, 5, 5);
        Arrays.sort(mergedArray);

        System.out.println("Merged and sorted array:");
        for (int num : mergedArray) System.out.print(num + " ");
    }
}
