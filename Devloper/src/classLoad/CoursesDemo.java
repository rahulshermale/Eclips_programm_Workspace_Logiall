package classLoad;
class Courese{
	void start(){
		System.out.println("Course start");
	}

	
}
class DacDbda extends Courese {
void start() {
	System.out.println("Hello Dac Students");
}	
void orientation(){
	System.out.println("Nitin Sir");
}
}
class Mscit1 extends Courese{
	void start() {
		System.out.println("Mscit student");
	}
}


public class CoursesDemo {
	
	public static void performs(Courese ref) {
		
		ref.start();
		if(ref instanceof DacDbda) {
		DacDbda OB=(DacDbda)ref;
		OB.orientation();}
		
		
		
	} 
	
	
	public static void main(String[] args) {
		
//		performs(new Courese());
		performs(new DacDbda());
		performs(new Mscit1());
	}


	

}
