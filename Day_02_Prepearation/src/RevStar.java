import java.util.Scanner;

public class RevStar {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter The Number : ");
	int r=sc.nextInt();
	
	
	for (int i=1;i<=r;i++) {
		for(int j=1;j<=(r+1-i);j++) {
			System.out.print("*");
			
			
		}
		
		System.out.println();
		
	}
	/*****
	****
	***
	**
	*/
	
	
	for(int i=r;i>=1;i--) {
		for(int j=i;j>=1;j--) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
