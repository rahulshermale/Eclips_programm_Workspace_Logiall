package asd;
//class base
//{
//	 void disp()
//	{
//		System.out.println("base disp");
//	}
//}
class sub extends base
{
	 void disp()  
	{
		System.out.println("sub disp");
	}
}
public class Demo5
{
	public static void main(String args[])
	{
		base s=new sub();
		s.disp();
		s.disp();

	// what compiler does

//	 base.disp();
//       
//        sub.disp(200);

	//
	}
}
