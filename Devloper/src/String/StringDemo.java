package String;

public class StringDemo {
	public static void main(String[] args) {
		
		String s1="Hello";
		
		String s2="Hello";
		String s3=new String("Hello");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s1.equals(s3));
		System.out.println(s1==s3.intern());
		System.out.println(s1==s2.intern());
		
	System.out.println(s1==s3);
	}
}
