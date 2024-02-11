package Day_04__;

import java.util.Scanner;

public class Reverse_String {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter string");
	String str=sc.next();
	
	for(int i=str.length()-1;i>=0;i--) {
		System.out.println(str.charAt(i));
	}
	
}
}
