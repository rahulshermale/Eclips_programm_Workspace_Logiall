import java.util.Scanner;

public class FindPower {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter The Number : ");
	int a=sc.nextInt();
	int b=sc.nextInt();
	
	int pow=1;
	while(0<b) {
		pow*=a;
	b--;	
	}
	System.out.println(pow);
}
}
