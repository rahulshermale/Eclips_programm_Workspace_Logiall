package String;

class Singelton{
	private static Singelton ob=new Singelton();
	private Singelton() {
		System.out.println("Helllo");
	}
	public static Singelton getSingelton() {
		return ob;
	}
	
}
public class SingeltonDemo {
public static void main(String[] args) {
	Singelton ref=Singelton.getSingelton();
	Singelton ref1=Singelton.getSingelton();
	
	System.out.println(ref.equals(ref1));
	System.out.println(ref==ref1);
	
	
}
}
