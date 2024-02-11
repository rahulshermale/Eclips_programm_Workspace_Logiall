package demo1;

class car1 {
	void start() {

	}
}

class Maruti1 extends car1 {
	
	void start() {
		System.out.println("Maruti start");
	}
}

class BMW1 extends Maruti1 {
	
	void start() {
//		super.start();
		System.out.println("BMW start");
	}
}

public class overriiding {
public static void main(String[] args) {
	car1 ob=new BMW1();
	ob.start();
}
}
