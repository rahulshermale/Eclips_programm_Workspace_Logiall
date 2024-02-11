import java.util.Scanner;

public class SumOfDigit {
public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter The Number : ");
	int num=sc.nextInt();
	
	
	int sumDigit=0;
	while(num>0) {
		
		sumDigit=sumDigit+(num%10);
	num=num/10;	
	}
	System.out.println(sumDigit);
}
}
 