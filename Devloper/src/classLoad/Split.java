package classLoad;

public class Split {
public static void main(String[] args) {
	String s1="My name is Khan. My name?is Bob. My name is Sonoo."; 
 
	
	String arr[]=s1.split("[?. ]",0);
	int count=0;
for(String w : arr) {
	System.out.println(w);
	count++;
};
System.out.println(count);

}
}
