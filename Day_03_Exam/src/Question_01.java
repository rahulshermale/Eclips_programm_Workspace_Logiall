

//Q1. Segregate positive and negative integers in linear time
//Given an array of positive and negative integers, the output should print all negative numbers,
//followed by all positive numbers.
public class Question_01 {
public static void main(String[] args) {
	int arr[]= {19,-13,15,-12,-18,-16,1,3};
	
	int first=0;
	int last =arr.length-1;
	while(first<=last) {
		if(arr[first] < 0 && arr[last] > 0 ) {
			first ++;
			last --;
		}
		else if(arr[first] >=0 && arr[last] <=+ 0) {
			int temp = arr[first];
			arr[first]=arr[last];
			arr[last] = temp;
			first ++;
			last--;
		}
		else if(arr[first] <= 0) {
			first++;
			
		}
		else
		{
			last--;
		}
		
	}
	for(int i=0; i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	
	
}
}
