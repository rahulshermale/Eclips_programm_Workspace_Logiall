package pack_01;

public class Binary_NUmber {

	public static void main(String[] args) {

		int row ;
		int col = 9;
		int lcol=10;
		for (int i = 1; i <= row; i++) {

			for (int j = 1; j <= col; j++) {

				if(i==j||i<=j) {

					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
				
				
			}
			System.out.println();
		}

	}
}