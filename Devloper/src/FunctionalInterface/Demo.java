package FunctionalInterface;

interface emp1 // functional interface
{
	String wish(String name);
}

public class Demo {
	public static void main(String args[]) {
		// using anonymous inner class

		emp1 ref1 = (String name) ->{
				return "Hello\t" + name;
			
		};
		System.out.println(ref1.wish("Rahul"));
		System.out.println("Implementation class name is\t" + ref1.getClass().getName());
		System.out.println();
	}
}