
public class Q3_Selection_sort{
public static void main(String[] args) {
	
	int arr[]= {20,6,4,3,9,0,1};
	
	for(int i=0;i<arr.length;i++) {
		int smallest=i;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[smallest]>arr[j]) {
				smallest = j;
			}
		}
		int temp =arr[smallest];
		arr[smallest]=arr[i];
		arr[i]=temp;
	}
	printArray(arr);
}

private static void printArray(int[] arr) {
	// TODO Auto-generated method stub
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]);
	}
}
}
