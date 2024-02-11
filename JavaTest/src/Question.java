import java.util.Scanner;

public class Question{
	private static int power(int x) {
		return x*x*x;
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int x=sc.nextInt();
		
		System.out.println("Enter the Number");
		int y=sc.nextInt();
		
		int z=power(x);
		System.out.println(z);
	}

	
}