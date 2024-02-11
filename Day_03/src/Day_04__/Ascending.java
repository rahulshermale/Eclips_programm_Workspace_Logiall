package Day_04__;
//Q7. Accept 5 name from user and print their name in ascending order

import java.util.Arrays;
import java.util.Scanner;

public class Ascending {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter string");
	
	String arr[]=new String[5];
	for(int i=0;i<5;i++){
		System.out.println("Enter name");
	     arr[i]=sc.nextLine();
		System.out.println();
	}
	Arrays.sort(arr);
	
	for(String nm : arr) {
		System.out.println(nm);
	}
}
}
