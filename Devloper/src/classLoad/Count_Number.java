package classLoad;

public class Count_Number {
	public static void main(String[] args) {

		int num = 1234;
		int sum = 0;
		int count = 0;
		while (num > 0) {
			
			num=num/10;
			count++;
		}
		System.out.println(count);
	}
}
