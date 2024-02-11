package Day_04__;

import java.util.Scanner;

public class Count_Words {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter sentence");
	String str=sc.nextLine();

//	System.out.println(str.length());
	int count=0;
	for(int i=str.length()-1;i>=0;i--) {
		count=count+1;
	}
	System.out.println(count);
}
}
