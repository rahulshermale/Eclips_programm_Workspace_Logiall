package Arraylist;

import java.util.ArrayList;
import java.util.*;

public class Using_Set {
public static void main(String[] args) {
	int array[] = { 2, 5, 6, 4, 9, 3, 2, 7, 1, 8, 2 };
ArrayList<Integer> number=new ArrayList<Integer>();
	for(int i=0;i<array.length;i++) {
		number.add(array[i]);
		
	}
	
	System.out.println(number);
	
	Set<Integer> num=new HashSet<Integer>(number);
	
//	System.out.println(number);
	System.out.println(num);
	
}
}
