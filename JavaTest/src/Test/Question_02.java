package Test;

import java.util.Scanner;

public class Question_02 {

	public static void main(String[] args) {

		int num1;
		int num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Number");
		num1 = sc.nextInt();

		System.out.println("Enter the Second Number");
		num2 = sc.nextInt();

		int pow = num1 * num1 * num1;

		if (pow == num2) {
			System.out.println(num2 + "\t is a Power of\t" + num1);
		} else {
			System.out.println(num2 + "\t is not  Power of\t" + num1);
		}

		power(num1);
System.out.println(pow);
	}

	public static void power(int num1) {

		int pow = num1 * num1 * num1;
	

	}

}
