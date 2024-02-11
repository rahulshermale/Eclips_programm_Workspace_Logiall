package mypack;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Example_02 {
	public static void main(String[] args) {
		
	
 PrintWriter pw;
 try {
	 pw=new PrintWriter("jtp.txt");
	 pw.println("Saved");
 }catch(FileNotFoundException e) {
	 
	 System.out.println(e);
 }
// System.out.println("Filed Save Successfully");
}
}