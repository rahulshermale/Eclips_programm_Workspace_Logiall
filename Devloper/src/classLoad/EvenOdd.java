package classLoad;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {

	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Number : ");
		int num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println("Even : "+num);
		}
		else {
			System.out.println("Odd : "+num);
		}
		
		
		
		String status= (num%2==0) ? "Even : "+num : "Odd : "+num;
		
		System.out.println(status);
		
		
	}
}
