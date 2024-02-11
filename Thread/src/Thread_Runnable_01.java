
public class Thread_Runnable_01 implements Runnable {
	synchronized public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello " + i+Thread.currentThread());
			/*try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}*/
		}
	}

	public static void main(String[] args) {
		Thread_Runnable_01 ob=new Thread_Runnable_01();
		Thread_Runnable_01 ob1=new Thread_Runnable_01();
		
		Thread t1=new Thread(ob);
		t1.setName("Rahul");
		Thread t2=new Thread(ob);
		t1.start();
		t2.start();
	}
}
