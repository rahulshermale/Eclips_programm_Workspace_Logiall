package classLoad;

public class Replace {
public static void main(String[] args) {
	String str="Rahul Shermale";
	String s1="My name is Khan. My name is Bob. My name is Sonoo."; 
	System.out.println(str.replace("h", "**"));
	System.out.println(s1);
	System.out.println(s1.replace("is", "was"));
	System.out.println(s1.replaceAll("is", "was"));
	
	System.out.println(s1.replaceAll("\\s",""));
	System.out.println(s1.replaceAll("", " "));
}
}
