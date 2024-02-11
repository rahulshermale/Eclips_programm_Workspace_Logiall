package classLoad;

class Xy {
	static {
		System.out.println("inside A static block");
	}
}

class Bb {
	static {
		System.out.println("inside B static block");
	}
}

public class Demo1 {
	private Xy ref1 = new Xy(); // lazy resolution
	private static Bb ref2 = new Bb(); // eager resolution

	public static void main(String[] args) {
		
		
		System.out.println("in main");
		
		new Demo1();  // class A will be loaded now
	}

}