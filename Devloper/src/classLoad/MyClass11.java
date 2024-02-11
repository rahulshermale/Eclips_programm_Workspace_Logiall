package classLoad;

class Ab {
	
	{
		System.out.println("in A static initializer");
	}

	Ab(){
		System.out.println("in A Constr initializer");
	}}

class B extends Ab {
	B(){
		System.out.println("in B Constru initializer");

	}
	 {
		System.out.println("in B static initializer");
	}
	
}

public class MyClass11 {
	

	
	public static void main(String args[]) {
		
//		MyClass11 ob=new MyClass11();
		B ref=new B();
	}

	
}
