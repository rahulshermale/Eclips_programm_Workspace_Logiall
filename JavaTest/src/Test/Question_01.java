package Test;


import java.util.Scanner;

public class Question_01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of Array");

		int size = sc.nextInt();

		int arr[] = new int[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the Element");
			arr[i] = sc.nextInt();

		}

		for (int i = 0; i < arr.length; i +=2) {
			int temp = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = temp;
		}
		for (int a : arr) {
			System.out.println(a);
		}
	}

	
}
