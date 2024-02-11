package demo;

class car {
	void start() {

	}
}

class Maruti extends car {
	void start() {
		System.out.println("Maruti start");
	}
}

class BMW extends car {
	void start() {
		System.out.println("BMW start");
	}
}

class demo {
	static void perform(car ref) {
		
		if(ref instanceof BMW) {
			ref.start();}
	
	else
		ref.start();
}}

public class carDemo {
	public static void main(String[] args) {
		demo.perform(new BMW());
		demo.perform(new Maruti());
	}
}
