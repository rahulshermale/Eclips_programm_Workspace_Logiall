package String;

class Base {
	static {
		System.out.println("In Base Satatic ");
	}
}

class Sub extends Base {

	static {
		System.out.println("In Sub Static");
	}
}

public class Demo {
	

	public static void main(String[] args) {
//		Demo ob = new Demo();
		Base ref = new Sub();
		System.out.println(ref);
	}
}
