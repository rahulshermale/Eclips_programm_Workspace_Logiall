package Demo;

public class Finally_Block {
public static void main(String[] args) {
	
	try {
		String s1=null;
		System.exit(0);
		s1.length();
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
	}
//	catch (NullPointerException e) {
//	System.out.println(e);
//	}
	
}
}
