package classLoad;

public class Fibonacci {
	public static void main(String[] args) {
		int num = 0;
		int num1 = 1;
System.out.print(num);
		for (int i = 0; i <= 4; i++) {
			int temp = num + num1;
			System.out.print(" "+temp);

			num = num1;

			num1 = temp;

		}

	}
}
