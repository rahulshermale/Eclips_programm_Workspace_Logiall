package classLoad;
class Courese12{
	void start(){
		System.out.println("Course start");
	}

	
}
class DacDbda12 extends Courese12 {
void start() {
	System.out.println("Hello Dac Students");
}	
void orientation(){
	System.out.println("Nitin Sir");
}
}
class Mscit12 extends Courese12{
	void start() {
		System.out.println("Mscit student");
	}
}


public class CoursesDemo1 {
	
//	public static void performss(Courese12 ref) {
//		
//		ref.start();
//		if(ref instanceof DacDbda12) {
//		DacDbda12 OB1=(DacDbda12)ref;
//		OB1.orientation();}
//		
//		
//		
//	} 
	
	
	public static void main(String[] args) {
		
////		performs(new Courese());
//		performss(new DacDbda12());
//		performss(new Mscit12());
		
		Courese12 ref=new Courese12();
		DacDbda12 ob=(DacDbda12)ref;
//		ob.start();
//		ob.orientation();
	}


	

}
