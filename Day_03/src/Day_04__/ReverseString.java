package Day_04__;

public class ReverseString {
public static void main(String[] args) {
	
	String str="Rahul";
	char []arr = str.toCharArray();
	
	
	for(int i= str.length()-1;i>=0;i--) {
		    
		
		System.out.print(arr[i]);
	}
	
	System.out.println();
	System.out.println("********************************");
	
	
	for(int i=str.length()-1;i>=0;i--) {
		System.out.print(str.charAt(i));
		
	}
}
}
