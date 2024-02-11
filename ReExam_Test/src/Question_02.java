import java.util.Scanner;

//Q2. Accept a sentence , accept a sentence and count number of sentence

public class Question_02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String str = sc.nextLine();

		int count = 0;
		for (int i = str.length(); i > 0; i--) {
			count++;

		}
		System.out.println(count);

	}
}
