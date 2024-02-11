package ArrayList;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetSort {
	public static void main(String[] args) {
		
		TreeSet t=new TreeSet(new myComparator());
		
		t.add("Rahul");
		t.add("Amar");
		t.add("Kunda");
		t.add("Shlok");
		System.out.println(t);
		
	}
}
	class myComparator implements Comparator{

		@Override
		public int compare(Object o1, Object o2) {
			
			String s1=(String)o1;
			String s2=(String)o2;
			
			
			return -s1.compareTo(s2);
//			return s2.compareTo(s1);
		}

		
	}

