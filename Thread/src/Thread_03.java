
public class Thread_03  extends Thread {
	
	public void run() {
		System.out.println(Thread.currentThread());
		for(int i=0;i<5;i++) {
			System.out.println("Rahul "+i);
		}
	}
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		Thread1 t1=new Thread1();
		Thread1 t2=new Thread1();
	
		
		t1.setName("first");
		
		t1.start();
		t2.start();
		
	}

}

