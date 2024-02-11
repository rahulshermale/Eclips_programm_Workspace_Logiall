package classLoad;
class Course{
	void start() {
		System.out.println("Course");
	}
}
class Dac extends Course{
	void start() {
		System.out.println("Dac Course");
	}
}
class Mscit extends Course{
	void start() {
		System.out.println("Dac Course");
	}
}
class Dbda extends Course{
	void start() {
		System.out.println("Dac Course");
	}
}

public class DemoCourse {
	static void perform(Course ref) {
		ref.start();
	}
	public static void main(String[] args) {
		perform(new Dac());	
	}

}
