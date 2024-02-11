package Array;

public class Instasnce {
	int a=10;
	static int b=20;
	public static void main(String[] args) {
		
		int fg=50;
		Instasnce ob=new Instasnce();
		System.out.println(ob.a);
		System.out.println(ob.b);
		ob.b=100;
		ob.a=200;
		Instasnce ob1=new Instasnce();
		System.out.println(ob.a);
		System.out.println(ob.b+"\n******************************************");
		
		System.out.println(ob1.a);
		
		System.out.println(ob1.b);
	}
}
