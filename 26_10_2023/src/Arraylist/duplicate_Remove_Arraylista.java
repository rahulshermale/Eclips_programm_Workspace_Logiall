package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class duplicate_Remove_Arraylista {
	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>();

		int array[] = { 2, 5, 6, 4, 9, 3, 2, 7, 1, 8, 2 };

		for (int i = 0; i < array.length; i++) {

			
			
			if (!arr.contains(array[i])) {

				arr.add(array[i]);

			}

		}
		System.out.println(arr);
		Collections.sort(arr);
		System.out.println(arr);
	}
}
