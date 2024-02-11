package Day_04__;

import java.util.Scanner;

public class CheckArray_or_Not {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter string");
	
	String arr[]=new String[5];
	for(int i=0;i<5;i++){
		System.out.println("Enter name");
	     arr[i]=sc.nextLine();
		System.out.println();
	}
	
	System.out.println("Enter given charecter");
	String chk=sc.next();

	boolean found = false;
	for(String name : arr) {
		if(name.equalsIgnoreCase(chk)) {
			found = true;
			break;
		}
		}
	if(found) {
		System.out.println("Found");
	}
	else {
		System.out.println("Not Found");
	}

}
}
