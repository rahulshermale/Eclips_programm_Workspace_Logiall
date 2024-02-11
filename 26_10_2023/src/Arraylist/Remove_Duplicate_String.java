package Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Remove_Duplicate_String {
	public static void main(String[] args) {
			
		
		Scanner sc=new Scanner(System.in);
		ArrayList<String> name=new ArrayList<String>();
		
		for(int i=0;i<5;i++) {
			String temp=sc.next();
			
		if(!name.contains(temp)) {
			name.add(temp);
			
		}
		
		
		}
		Collections.sort(name);
		System.out.println(name);
		
	}
}
