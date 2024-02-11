package interface_01;

public class Test {
	public static void main(String[] args) {

		String s1 = "Rahul";
	String rev="";
	for(int i=s1.length()-1;i>=0;i--) {
		
		rev+=s1.charAt(i);
	}
	
	System.out.println(rev);
		
	
	
	System.out.println(s1.substring(3));	//ul
	System.out.println(s1.substring(2,3));//H
	System.out.println(s1.replace("h", "_"));
	
	
	System.out.println(s1.indexOf("h"));
	
	}
	
	
}
