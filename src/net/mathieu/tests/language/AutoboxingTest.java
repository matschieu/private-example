package net.mathieu.tests.language;


public class AutoboxingTest {

	public static void main(String[] args) {
		Integer a = new Integer(100);
		Integer b = new Integer(100);
		Integer c = new Integer(1000);
		Integer d = new Integer(1000);
		
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(c == d);
		System.out.println(c != d);

		System.out.println();
		
		for(int i = 250; i < 260; i++) {
			Integer a_ = new Integer(i);
			Integer b_ = new Integer(i);
			
			System.out.println(a_ == b_);
			System.out.println(a_ != b_);
			System.out.println();
		}
	}
	
}
