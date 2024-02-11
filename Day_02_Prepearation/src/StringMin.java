
public class StringMin {
	public static int minLength(String s) {

		int i = 0;
		int j = s.length() - 1;
		while (i < j && s.charAt(i) == s.charAt(j)) {

			char ch = s.charAt(i);

			while (ch == s.charAt(i)) {
				i++;

			}
			while (ch == s.charAt(j)) {
				j--;
			}

		}

		return j - i + 1;

	}

	public static void main(String[] args) {

		String s = "aacbcca";
		System.out.println(s.length());
		System.out.println(minLength(s));
	}

}
