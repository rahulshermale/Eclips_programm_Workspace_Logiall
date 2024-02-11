package classLoad;


public class MyClass12
{
	static
	{
		System.out.println("in MyClass12 first static initializer");
	}
	public static void main(String args[])
	{
		System.out.println("in main");
	
		A arr=new A();	
	
	}
	MyClass12 jk=new MyClass12();
	static
	{
		System.out.println("in MyClass12 second static initializer");
	}
}
class A
{A(){
	System.out.println("hello");
}
	static
	{
		System.out.println("in A first static initializer");
	}
	
	
}