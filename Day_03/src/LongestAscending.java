
import java.util.Scanner;

public class LongestAscending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 10-digit number: ");
        long number = scanner.nextLong();

        String numStr = Long.toString(number);
        String longestAscending = "";
        String currentAscending = String.valueOf(numStr.charAt(0));

        for (int i = 1; i < numStr.length(); i++) {
            if (numStr.charAt(i) > numStr.charAt(i - 1)) {
                currentAscending += numStr.charAt(i);
            } else {
                if (currentAscending.length() > longestAscending.length()) {
                    longestAscending = currentAscending;
                }
                currentAscending = String.valueOf(numStr.charAt(i));
            }
        }

        if (currentAscending.length() > longestAscending.length()) {
            longestAscending = currentAscending;
        }

        System.out.println("Longest ascending number: " + longestAscending);
    }
}


















//*********************************


import java.util.Arrays;

public class SegregatePositiveNegative {
    public static void main(String[] args) {
        int[] arr = {9, -3, 5, -2, -8, -6, 1, 3};

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            if (arr[left] < 0 && arr[right] >= 0) {
                left++;
                right--;
            } else if (arr[left] >= 0 && arr[right] < 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            } else if (arr[left] < 0) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
