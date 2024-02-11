package Array;

import java.util.Iterator;



public class Demo_01 {
public static void main(String[] args) {
	int []arr=new int[3];
	
	arr[0]=10;
	arr[1]=20;
	arr[2]=30;

//	System.out.println(arr);
//	System.out.println(arr[0]);
//	System.out.println(arr[1]);
//	System.out.println(arr[2]);
	
	
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	
	System.out.println("########################################################");
	
	for(int a : arr) {
		System.out.println(a);
	
	}
	
}
}
