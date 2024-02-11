package Test;

import java.util.Arrays;

public class Question_03 {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 1, 4, 5, 6, 1, 2};

        int[] resultArray = removeDup(inputArray);

        System.out.print("Output array after removing duplicate ");
        for (int num : resultArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] removeDup(int[] arr) {
        int[] uniqueArray = new int[arr.length];
        int uniqueCount = 0;

        for (int num : arr) {
            if (!contains(uniqueArray, uniqueCount, num)) {
                uniqueArray[uniqueCount] = num;
                uniqueCount++;
            }
        }

        return Arrays.copyOf(uniqueArray, uniqueCount);
    }

    public static boolean contains(int[] arr, int count, int num) {
        for (int i = 0; i < count; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
}
