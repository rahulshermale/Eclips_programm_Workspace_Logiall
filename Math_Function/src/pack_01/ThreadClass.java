package pack_01;

class MyThread extends Thread 
{

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Childe Thread");// StaticBlock.java
		}
	}
//	if we override start method then it is act as a normal method and no new thread will be exicuted
	
public void start() {
		System.out.println("Start Method will be exicuted");
	
	
	
	}

}

public class ThreadClass {
	public static void main(String[] args) {

		MyThread n = new MyThread();
	n.start();
//		n.run();

//		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread");// StaticBlock.java
//		}

	}
}
