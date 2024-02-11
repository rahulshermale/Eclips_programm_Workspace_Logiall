package pack_01;

class RunThread implements Runnable {
	
	public void run() {
		
		
		
		System.out.println("Run method ");
	}
}

public class RunnableTread {
	public static void main(String[] args) {
		
	
RunThread rt=new RunThread();
Thread t=new Thread(rt);

//t.start();
t.setName("Rahul");
System.out.println(t.getName());

}
}