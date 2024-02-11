package classLoad;

import java.util.Scanner;

public class SumOfDigit {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number");

		int num = sc.nextInt();
int count=0;
		int sum = 0;
		while (num > 0) {

			sum = sum + num % 10;
			num=num/10;
			count++;
		}
		System.out.println(sum);
System.out.println(count);
	}
}
