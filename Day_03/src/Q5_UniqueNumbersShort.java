import java.util.*;

public class Q5_UniqueNumbersShort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) arr[i] = scanner.nextInt();

        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int num : arr) uniqueNumbers.add(num);

        System.out.println("Unique numbers in the array: " + uniqueNumbers);
    }
}

