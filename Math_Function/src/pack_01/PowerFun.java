package pack_01;

public class PowerFun {
public static void main(String[] args) {
	
	int a=(int)Math.pow(5,2);
	
	System.out.println(a);
	
	System.out.println((int)Math.ceil(11.20));
	
	System.out.println(Math.round(11.56));
	System.out.println(Math.round(11.46));
	
	
	String s2="Rahul";
	System.out.println(s2.substring(2));
	System.out.println(s2.substring(2,3));
	System.out.println(s2.substring(4));
	
	System.out.println();
	
	String s1="ahul";
	String s3="rahul";
	
	System.out.println(s1.equals(s3.substring(1)));
	
}
}
