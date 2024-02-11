import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputDemo {
public static void main(String[] args) {
	try(FileOutputStream fos=new FileOutputStream("C:\\Users\\91897\\eclipse-workspace\\Stream\\src\\FirstDemo1.java",true)){
		byte b[]=new byte[1000];
		System.out.println("Enter Data");
		int k=System.in.read(b);
		fos.write(b,0,k);
		
	} 
	catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
}
}
