package mypack;

import java.util.Scanner;

public class Example_03 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		// outer block........
//		System.out.println("Enter the number ");

		try {
			// inner block ......
			try {

//				int x = sc.nextInt();
				int y = 10 / 0;
			}
			catch (ArithmeticException e) {
				System.out.println("Inner Block "+e);
			}
			//Second inner block
			try {
				int a[]=new int[5];
				a[5]=4;
			} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(" Invalid input . please enter the valid number "+e);
		}
			
			System.out.println("Other Statements");
		} catch(Exception e) {
			System.out.println("Handled the Exception(Outer catch)");
		}
		
	}
}
