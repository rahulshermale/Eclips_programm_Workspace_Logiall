import java.util.Arrays;

/*Write a program to sort a random list of nos. provided in an array like below

{29, 3, 7, 90, 45}

Print the same on the page, in ascending as well as descending order.*/
public class Question_01 {
public static void main(String[] args) {
	       int[] num = {29, 3, 7, 90, 45};

	        System.out.println("Original Num " + Arrays.toString(num));

	      
	        Arrays.sort(num);
	        System.out.println("Ascending Order" + Arrays.toString(num));

	        // Sort in descending order (reverse the array)
	        for (int i = 0; i < num.length / 2; i++) {
	            int temp = num[i];
	            num[i] = num[num.length - 1 - i];
	            num[num.length - 1 - i] = temp;
	        }
	        System.out.println("Descending Order " + Arrays.toString(num));
	 

	
}
}
