package Day_04__;

import java.util.Scanner;

public class PalindromCheck {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter string");
	String str=sc.next();
	String rev="";
	for(int i=str.length()-1;i>=0;i--) {
	char s=str.charAt(i);
//		System.out.println(str.charAt(i));
	rev=rev+s;
	}
	System.out.println(str.equalsIgnoreCase(rev));
	
}
}
