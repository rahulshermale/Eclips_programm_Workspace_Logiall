package mypack;
public class DivideByZero {
public static void main(String[] args) {
	try{
		int Num=100/0;
	}
	catch(ArithmeticException e){
//		System.out.println(e);
	}
	System.out.println("Rest Of the code Will be Work");

try {
	String s=null;
	System.out.println(s.length());
} catch (NullPointerException e) {
	System.out.println();
}
System.out.println("Other code will be work");

try {int [] arr=new int[5];
arr[10]=10;
System.out.println(arr[10]);

} catch (Exception e) {
//	System.out.println(e);
}
System.out.println("Another Code Will be work");
}
}
