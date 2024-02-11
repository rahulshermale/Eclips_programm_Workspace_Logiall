
public class CountOfDigit {
	public static void main(String[] args) {

		int num1 = 12345;
int num=num1;
		int cnt = 0;
		while (num > 0) {

			num = num / 10;
			cnt++;
		}
		System.out.println(cnt+" "+num+" "+num1);
	}
}
