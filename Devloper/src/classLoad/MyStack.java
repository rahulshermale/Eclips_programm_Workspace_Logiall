package classLoad;

import java.util.Stack;

public class MyStack {
public static void main(String[] args) {
	

	Stack ob=new Stack();
	
	ob.add(10);
	ob.push(20);
	ob.push("RAhul");
	System.out.println(ob);
	
	ob.pop();System.out.println(ob);
	System.out.println(ob.peek());;
}
	
	
}
