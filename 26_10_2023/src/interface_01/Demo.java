package interface_01;

import java.security.DomainCombiner;

interface Animal{
	void run();
}

interface Dog{
	void run();
	
}
interface Cat{
	void run();
    abstract void disp();
}

public class Demo  implements Animal,Dog,Cat{

	public static void main(String[] args) {
		Animal a=new Demo();
		a.run();

		Dog d=new Demo();
		d.run();
		Cat c=new Demo();
			c.disp();
		c.run();
	}
	@Override
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello ");
		
	}
	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("disp Method");
	}

	
	
}
