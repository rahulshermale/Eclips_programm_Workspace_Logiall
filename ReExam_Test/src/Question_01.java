import java.util.Scanner;
/*Q1. Accept 5 element in an array. 
 * Pass this array in function and write bubble sort algorithm to sort
data. Print sorted data in main method*/

public class Question_01 {

	public static void bubbleSort(int[] arr) {
	        int n = arr.length;
	        for (int i = 0; i < n - 1; i++) {
	        	
	            for (int j = 0; j < n - i - 1; j++) {
	                if (arr[j] > arr[j + 1]) {
	                  
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	            }
	        }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the Element");
			arr[i] = sc.nextInt();

		}
		for (int num : arr) {
			System.out.print(num);
		}
		bubbleSort(arr);
System.out.println();
		for (int num : arr) {
			System.out.print(num);
		}

	}

}
