package PolyMorphisom;

class Person{
void run(){
	System.out.println("run Person");
}

}
class Student extends Person {
	void run() {
		System.out.println("Void run Student");
	}
	void disp() {
		System.out.println("Disp");
	}
}
class demon{
	static void perform(Person ref) {
		ref.run();
		if (ref instanceof Student) {
			Student s1 = (Student) ref;
			s1.disp();
		}
		
	}
}
public class PersonDemo {
	
	

	

public static void main(String[] args) {
	
	demon.perform(new Student());
}
}
