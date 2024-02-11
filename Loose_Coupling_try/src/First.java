 abstract class Shape{
	public abstract void draw();
}
 class Circule extends Shape{
	 public void draw() {
		 System.out.println("This is a Circule Draw Method");
	 }
 }
 class Tringle extends Shape{
	 public void draw() {
		 System.out.println("This is a tringle shape");
	 }
 }
 class MyMethod{
	 public void drawShape(Shape ref) {
		 ref.draw();
	 }
 }
public class First {
public static void main(String[] args) {
	MyMethod obj=new MyMethod();
	obj.drawShape(new Circule());
	obj.drawShape(new Tringle());
	obj.drawShape(new Circule());
	
}
}
