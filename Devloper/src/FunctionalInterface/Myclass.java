package FunctionalInterface;

interface person {
	String run(String name);
}

public class Myclass {
public static void main(String[] args) {
	

	person ref =new person() {
	public String run(String name) {
		return "My Name Is "+name;
	}
};
System.out.println(ref.run("Rahul"));





person ref1=(String name)->{return "My Name is "+name ;};

System.out.println(ref1.run("Anil"));
}}
