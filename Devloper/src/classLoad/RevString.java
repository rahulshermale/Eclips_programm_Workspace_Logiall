package classLoad;

public class RevString {
public static void main(String[] args) {
	
	String str="Rahul";
	String rev="";
	System.out.println(str.charAt(4));
	
	
	
	for(int i=str.length()-1;i>=0;i--) {
		
		rev+=str.charAt(i);
	}
	System.out.println(rev);
}
}
