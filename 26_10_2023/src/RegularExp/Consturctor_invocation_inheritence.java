package RegularExp;

class Vehical {
	Vehical(int no) {
		System.out.println("Hello Vehical");
	}

	Vehical() {
		// TODO Auto-generated constructor stub
	}
}

class Tractor extends Vehical {
	Tractor() {
		super(10);
		System.out.println("Hello My Tractor is PowerFull");
	}
}

public class Consturctor_invocation_inheritence {
	public static void main(String[] args) {

		Tractor t = new Tractor();

	}
}
