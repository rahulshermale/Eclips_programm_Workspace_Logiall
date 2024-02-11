package Array;

public class Var_Arguments_Example {

	private static void sum(int... j) {
		int total = 0;
		for(int sum :j) {
			total+=sum;
		}
		for (int i = 0; i < j.length; i++) {
			total += j[i];
				}
		System.out.println(total);
	}

	public static void main(String[] args) {
		sum(10);
		sum(10, 20);
		sum(5, 6, 10);

	}

}
