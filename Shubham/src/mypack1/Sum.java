package mypack1;

class Demo{
	
 int num1;  //instance variable/global variable

	public int Calculation() {
		int no=5;   //local variable
		int sum= no + num1;
		return sum;
	}
	
	
	void disp() {
		int no=2;
		int multiply =num1*no;
	}
	
	
}

public class Sum {

	public static void main(String[] args) {
		
		
		Demo d=new Demo();
		
		
		
		
		int num = 10;  //local variable
		
		
		int abc = d.Calculation();
		
		
		
		System.out.println(abc);
	}
}
