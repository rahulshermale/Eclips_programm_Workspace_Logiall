import java.io.File;
import java.util.Date;

public class FirstDemo {
public static void main(String[] args) {
	
	File f=new File("FirstDemo.java");
	
	
	
	System.out.println(f.getName());
	System.out.println(f.getPath());
	System.out.println(f.getAbsolutePath());
	System.out.println(f.isAbsolute()?"Yes Write":"Can not Write");
	System.out.println(new Date(f.lastModified()));
	System.out.println(f.length());
	System.out.println(f.hashCode());

}
}
