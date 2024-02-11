package Set;




import java.util.*;
public class StoreObject {
public static void main(String[] args) {
	
	List<StoreObject> ref=new ArrayList<StoreObject>();
	
	StoreObject obj1=new StoreObject();
	StoreObject obj2=new StoreObject();
	StoreObject obj3=new StoreObject();
	
	ref.add(obj3);
	ref.add(obj2);
	ref.add(obj1);

//	Iterator itr=new Iterator();//
	for(StoreObject m: ref) {
		System.out.println(m);
	}
}
}
