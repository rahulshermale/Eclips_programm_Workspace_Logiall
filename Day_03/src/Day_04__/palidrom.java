package Day_04__;

import java.util.Scanner;

public class palidrom {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter string");
	String str=sc.next();
	System.out.println("Check chara");
	char fchar=sc.next().charAt(0);
	System.out.println(str.indexOf(fchar));
	
	
}
}
