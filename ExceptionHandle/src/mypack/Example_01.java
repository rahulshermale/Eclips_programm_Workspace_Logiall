package mypack;

public class Example_01 {
public static void main(String[] args) {
	try {
		System.out.println("Hello Word");
		
		int arr[]= {1,2,3,4,6};
		System.out.println(arr[6]);
		
		
	}
	catch(Exception e) {
		System.out.println(e);
		System.out.println("Other code will work");
	}
}
}
