package Demo;


public class User_Defined {
public static void main(String[] args)  {
	try {
		throw new  User_Exception("Create a User Exception");
	} catch (User_Exception e) {
		
//		e.printStackTrace();
	}

	
}
}

class User_Exception extends Exception{
	User_Exception(String arg){
		System.out.println("Helllo  ........");
		System.out.println(arg);
		
		
	}

	
}