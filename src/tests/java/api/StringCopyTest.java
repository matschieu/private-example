package tests.java.api;


public class StringCopyTest {

	public static void main(String[] args) {
		String s1 = "s1";
		String s2 = s1;
		s1 = "s1.1";
		
		System.out.println(s1);
		System.out.println(s2);
	}
}
