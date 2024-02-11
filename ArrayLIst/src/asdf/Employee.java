package asdf;

import java.util.ArrayList;
import java.util.Iterator;

class Employee {
	private int empid;
	private String name, design;
	private double salary;

	public Employee(int empid, String name, String design, double salary) {
		this.name = name;
		this.design = design;
		this.name = name;
		this.salary = salary;

	}

	public String toString() {
		return (name+" "+design+" "+empid+" "+salary);
	}
}
class Demo {
public static void main(String[] args){
Employee e1=(new Employee(10,"Rahul","Man",500000));
Employee e2=(new Employee(10,"Sidhartg","ass",450000));
Employee e3=(new Employee(10,"Amresh","Dev",550000));
Employee e4=(new Employee(10,"Rakesh","test",60000));

ArrayList<Employee>li=new ArrayList<>();

li.add(e1);
li.add(e2);
li.add(e3);
li.add(e4);
Iterator<Employee> it=li.iterator();
while(it.hasNext()){
	Employee emp=it.next();
	System.out.println(emp);
    }
  }

	}