package Inner_pack_02;

import java.util.ArrayList;
import java.util.Iterator;

public class WrapperClasses {
	public static void main(String[] args) {

		ArrayList a = new ArrayList();

		for (int i = 0; i < 10; i++) {
			a.add(i);
		}
		
		
		System.out.println(a);
		
		Iterator itr=a.iterator();
		
		while (itr.hasNext()) {
			
			int x=(int) itr.next();
			if(x%2==0)
				System.out.println(x);
			else
				itr.remove();

			
		}
		System.out.println(a);
		
		
		
		System.out.println(compare(10,20));
	}

	private static char[] compare(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}
}
