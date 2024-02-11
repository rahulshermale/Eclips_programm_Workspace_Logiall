package abc;

public class Thread_02  extends Thread {
	
	public void run() {
		System.out.println(Thread.currentThread());
		for(int i=0;i<5;i++) {
			System.out.println("Rahul "+i);
		}
	}
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		Thread_02 t1=new Thread_02();
		Thread_02 t2=new Thread_02();
	
		
		t1.setName("first");
		t2.setName("second");
		
		
		t1.start();
		t2.start();
		
	}

}
