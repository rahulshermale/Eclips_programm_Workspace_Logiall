package Demo;

class Base {
	Base(int num) {
		System.out.println("IN Base Class " + num + 10);
	}

	void ref() {
		System.out.println("INside base");
	}

}

class Sub extends Base {

	Sub(int id) {

		super(id);
		System.out.println("In Sub Class");
	}

	void disp() {
		System.out.println("Inside Sub");
	}

}

public class Super {
	public static void main(String[] args) {
		Base ob = new Sub(30);
		((Sub) ob).disp();
	}
}
