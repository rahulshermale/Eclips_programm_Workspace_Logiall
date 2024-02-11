
public class WhileLoop {
	public static void main(String[] args) {

		int n = 10;
int sum=0;
		int num = 1;

		while (num <= n) {
			System.out.println(num);
			sum=sum+num;
			num++;
		}
		System.out.println(sum);
	}
}
