package Overriding;

class Vehical {
	void run() {
		System.out.println("Hello Brother");
	}
}

class Tractor extends Vehical {
			
}

public class Overriding_method {
	public static void main(String[] args) {

		Vehical t = new Tractor();
		t.run();
	}
}

//o/p Hello Brother 
