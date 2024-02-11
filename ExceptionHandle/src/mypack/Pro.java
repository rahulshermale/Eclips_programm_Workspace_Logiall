package mypack;

public class Pro {
public static void main(String[] args) {
	
	try {
		
		int a=10/0;
	System.out.println(a);
	
	
	}
	catch(ArithmeticException e) {
		System.out.println(e);
//		e.printStackTrace();
	}
//	System.out.println("Hello Word");
}
}
