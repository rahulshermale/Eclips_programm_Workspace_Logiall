package RegularExp;

class Dog {
	private int id;
	private String name;
	private String type;

	public Dog(int id, String name, String type) {

		this.id = id;
		this.name = name;
		this.type = type;
	}

//	@Override
	public String toString() {
		
	return"Dog [id=" + id + ", name=" + name + ", type=" + type + "]";
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

}

public class Array_of_object {
	public static void main(String[] args) {

		Dog[] d = new Dog[3];

		d[0] = new Dog(10, "Moti", "Hybrid");
		d[1] = new Dog(10, "Tiger", "Hybrid");
		d[2] = new Dog(10, "Dolly", "Dachshund");

//	for(int j=0;j<d.length;j++) {
//		System.out.println((j+1)+" "+d[j]+" " );
//		
//	}

		System.out.println(d[0]);
//		System.out.println(d[1]);
		System.out.println(d[1]);
		System.out.println(d[0]);
	}
}
