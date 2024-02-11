/*3
323
32123
323
3*/
public class Question_03 {
public static void main(String[] args) {
	int cnt=3;
	for (int i=1;i<=3;i++) {
		for(int j=3;j>=i;j--) {
			System.out.print(" ");
		}
		
		for(int k=3;k>=cnt;k--) {
			System.out.print(k+"");
		}
		cnt -=1;
//		for (int l = 3; l <= i; l--) {
//
//			System.out.print(l);
//
//		}
		System.out.println("");
	}
}
}
