package Day_04__;

public class remove_Sepcial_char {
public static void main(String[] args) {
	
	String str="$R&%A^$%H)(U}{L";
	
	String rstr=str.replaceAll("[^a-zA-Z]", "");
	System.out.println(rstr);
}
}
