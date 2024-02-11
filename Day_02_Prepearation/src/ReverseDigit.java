import java.util.Scanner;

public class ReverseDigit {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Number : ");
		int num=sc.nextInt();
		int num2=121;
		int reverse=0;
		while(num>0) {
			reverse=reverse*10+num%10;
			num=num/10;
			
		}
		System.out.println(reverse);
		
		System.out.println(reverse==num2);
	}
}
