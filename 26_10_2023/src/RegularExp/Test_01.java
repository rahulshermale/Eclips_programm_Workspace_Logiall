package RegularExp;

import java.util.regex.*;

public class Test_01 {
	public static void main(String[] args) {
		 
		Pattern p=Pattern.compile("[^ab]");
		
		Matcher m=p.matcher("ababbabab%$##sab");
//		int cnt=0;
		while(m.find()) {
//			cnt++;
			System.out.println(" ............  "+m.group());
		}
//		System.out.println(m.group());
		
		
		String text = "This is a ababbabab%8750$##sab sample sentence.";
		String[] words = text.split("[^a-zA-Z0-9]"); 
		for(String s2 : words) {
			System.out.print(s2);
		}
	}
}
