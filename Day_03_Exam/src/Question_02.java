import java.util.Scanner;
//Q2. Accept 5 number in an array, accept a number from user and check if given number is there in
//an array or not
public class Question_02 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int [] arr=new int[5];
	
	for(int i=0;i<arr.length-1;i++) {
		
		System.out.println("Enter a Number :");
		
		arr[i]=sc.nextInt();
		
	}
	System.out.println("Enter the Number To check: ");
	int checkNum=sc.nextInt();
	
	boolean found = false;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==checkNum) {
			found=true;
			break;
		}
	}
	if (found) {
		System.out.println(checkNum+"is present in the array ");
	}
	else {
		System.out.println(checkNum+" is Not Present in The Arrey ");
	}
}
}
