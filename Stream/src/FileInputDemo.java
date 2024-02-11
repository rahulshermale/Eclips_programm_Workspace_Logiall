import java.io.*;

public class FileInputDemo {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\91897\\eclipse-workspace\\Stream\\src\\FirstDemo.java");

		if (!f.exists()) {
			System.out.println("Not Available File");
			System.exit(0);
		}

		try (FileInputStream fis = new FileInputStream(f)) {
			byte b[] = new byte[((int) f.length())];
			fis.read(b);
			String ss = new String(b);
			System.out.println(ss);

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
