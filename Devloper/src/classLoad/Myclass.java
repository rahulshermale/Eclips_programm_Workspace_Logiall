package classLoad;

import java.util.ArrayList;
import java.util.Iterator;

public class Myclass {
public static void main(String[] args) {
	
	
	ArrayList<String> ob=new ArrayList<String>();
	
	
	System.out.println(ob);
	ob.add("Rahul");
	ob.add("Akkash");
//	ob.add(10);
//	ob.add(20);
	System.out.println(ob);
	
	

	
	Iterator itr=ob.iterator();	
	
	while(itr.hasNext()) {
		System.out.print(itr.next()+         " ");
		
	}
	
}
}
