package RegularExp;

public class RemovSpecial {
public static void main(String[] args) {
	String s1="Ja%3v$a5@Sta00r";
	
	String s2=s1.replaceAll("[^a-zA-Z]", "");
	
	
	System.out.println(s2);
}
}
