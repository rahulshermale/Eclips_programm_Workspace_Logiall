package List;

import java.util.*;
//import java.util.List;

public class DemoArrayList {
	public static void main(String[] args) {

		List<String> ref = new ArrayList<String>();
		System.out.println(ref.size());
		ref.add("sr");
		ref.add("Rahm");
		ref.add("Sham");
		ref.add(0, "Rahul");
		ref.add("AFkash");
		ref.add("AAka");
		ref.add("Zed");
		System.out.println(ref.size());
		System.out.println(ref.indexOf("Sham"));
		System.out.println(ref.iterator());
		System.out.println(ref.toArray());
		System.out.println();
		for (String w : ref) {
			System.out.println(ref);
		}
		Collections.sort(ref,Collections.reverseOrder());
		System.out.println(ref.size());
		for (String w : ref) {
			System.out.println(ref);
		}
	}
}
