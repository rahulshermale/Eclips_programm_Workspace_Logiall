package mypack;

import java.util.Scanner;
class UserException extends Exception{
	UserException(String string){
		System.out.println(string);
	}	
}

class Demo{
	public static int calculation(int num) throws UserException {
		if(num==0) {
			throw new UserException("Zero Number");
		}
		else if(num<0) {
			throw new UserException("Negaticve number");
		}
		
		else return num*2;
	}
}
public class userExcpetionDemo {
		
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter Number");
	int num=sc.nextInt();
	
	try {
		
		System.out.println(Demo.calculation(num));
		
	} catch (Exception e) {
		System.out.println(e);
	}
}

}
