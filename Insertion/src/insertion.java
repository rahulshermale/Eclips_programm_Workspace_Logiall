public class insertion{
	public static void main(String[] args) {
		int arr []= {10,20,50,7,30,9,0520,05465};
		int count =0 ;
		for(int i=1;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				
					}
				
				
				
			}System.out.println(arr[i]);
		}
	}
	
}