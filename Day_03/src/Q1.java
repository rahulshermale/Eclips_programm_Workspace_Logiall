import java.util.Scanner;

//Q1. Accept 5 number in an array, 
//accept a number from user and check 
//if given number is there in an array or not 

public class Q1 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int []arr=new int[5];
	for(int i = 0 ; i<=arr.length-1;i ++) {
		
		System.out.println("Enetr the Number to store array");
		arr [i]= sc.nextInt();
	}
	
	System.out.println("Enter the Number To check: ");
	int chNum=sc.nextInt();
	
	boolean found = false;
	
	for(int num : arr) {
		if(num==chNum) {
			found =true;
			break;
		}
	}
	if (found) {
		System.out.println(chNum+"is present in the array ");
	}
	else {
		System.out.println(chNum+" is Not Present in The Arrey ");
	}
}
}
