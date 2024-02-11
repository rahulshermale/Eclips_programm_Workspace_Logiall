package FileIo;

import java.lang.reflect.InvocationTargetException;

class Sample{
	
	static
	{
		System.out.println("This is a static block");
	}
	
	void disp() {
		System.out.println("Disp Method ");
	}
	
	Sample(){
		System.out.println("INside constructor");
	}
	{
		System.out.println("This is a NoN Static Block");
	}
}



public class first {
public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException  
{
	
//	 Class.forName("FileIo.Sample").newInstance();
	 Class.forName("FileIo.Sample").getDeclaredConstructor().newInstance();
	
//	Sample s1=(Sample) c.newInstance();
	
//	s1.disp();
	
}
}
