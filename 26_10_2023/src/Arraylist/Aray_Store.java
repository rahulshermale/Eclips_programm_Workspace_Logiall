package Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Aray_Store {
	public static void main(String[] args) {

		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		System.out.println("Enter A Element");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			int temp = sc.nextInt();
			if (!arr1.contains(temp)) {
				arr1.add(temp);
			}
		}
		Collections.sort(arr1);
		System.out.println(arr1);
	}
}
