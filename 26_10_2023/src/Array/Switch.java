package Array;

import java.util.Scanner;

public class Switch {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int Day=sc.nextInt();
	
	switch(Day) {
	
	case 1:
		System.out.println("Jan");
		
	break;
	case 2 :
		System.out.println("Feb");
	case 3:
		System.out.println("Mar");
	case 4:
		System.out.println("Apr");
	case 5:
		System.out.println("may");
	
	default:
		System.out.println("After MAY");
		
	}
}
}
