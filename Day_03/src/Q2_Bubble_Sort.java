import java.util.Scanner;

public class Q2_Bubble_Sort {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int []arr=new int[5];
	for(int i = 0 ; i<=arr.length-1;i ++) {
		
		System.out.println("Enetr the Number to store array");
		arr [i]= sc.nextInt();
	}
	//Bubble sort Algorithm
	for(int i=0;i<arr.length-1;i++) {
		for(int j=0;j<arr.length-i-1;j++) {
			if(arr[j]<arr[j+1]) {
				int temp=arr[j];
				 arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	printArray(arr);
	
}

public static void printArray(int[] arr) {
	// TODO Auto-generated method stub
	for(int i=0; i<arr.length;i++) {
		System.out.print(arr[i]);
	}
}
}
