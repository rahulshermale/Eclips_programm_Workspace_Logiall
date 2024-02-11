import java.util.Scanner;

//Find factorial of a number
public class Question_01 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number");
	
	int num=sc.nextInt();
	int ref=1;
	for(int i=1;i<=num;i++) {
		
		
		ref *=i;
	}
	System.out.println(ref);
}
}
