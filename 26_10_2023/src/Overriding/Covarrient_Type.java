package Overriding;

class Animal{
	Animal(int id){

	
	}
}
class Dog {
	
	
	
}
class Cat{
	Animal disp() {
		return null;
		
		
	}
	
	Object run() {
		return 10;
		
	}
	
}


public class Covarrient_Type {
public static void main(String[] args) {
Cat c=new Cat();
System.out.println( c.run());
}
}
