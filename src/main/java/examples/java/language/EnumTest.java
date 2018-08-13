package examples.java.language;


public class EnumTest {

	private enum Toto { titi, tutu }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		testValueOf();
	}
	
	public static void testEquals() {
		System.out.println(Toto.titi.equals(Toto.titi));
		System.out.println(Toto.titi.equals(Toto.tutu));
		System.out.println(Toto.titi.equals(null));
		System.out.println(Toto.titi.equals(""));
	}
	
	public static void testValueOf() {
		//Toto.valueOf("tata");
		Toto.valueOf("");
		Toto.valueOf(null);
	}

}
