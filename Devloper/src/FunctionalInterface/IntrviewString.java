package FunctionalInterface;

public class IntrviewString {
	public static void main(String[] args) {
		String s1 = new String("Rahul");
		String s2 = s1.concat(s1);
		s1 = null;
		System.out.println(s1);
		System.out.println(s1);
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);

	}

}
