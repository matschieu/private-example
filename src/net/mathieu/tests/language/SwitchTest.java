package net.mathieu.tests.language;


public class SwitchTest {

	enum MyEnum { ENUM1, ENUM2 };
	
	public static void main(String[] args) {
		MyEnum myEnum = null;
		
		switch (myEnum) {
		case ENUM1:
			System.out.println(MyEnum.ENUM1);
			break;
		case ENUM2:
			System.out.println(MyEnum.ENUM2);
			break;
		default:
			System.out.println("default");
			break;
		}
	}
}
