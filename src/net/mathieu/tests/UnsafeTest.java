package net.mathieu.tests;

import java.lang.reflect.Field;

//import sun.misc.Unsafe;

class Unsafe {
	void allocateMemory(long l) {}
}

public class UnsafeTest {

	public static void main(String[] args) throws Exception {
		Field f = Unsafe.class.getDeclaredField("theUnsafe");
		f.setAccessible(true);
		Unsafe unsafe = (Unsafe)f.get(null);

		Runtime runtime = Runtime.getRuntime();

		System.out.println(String.format("%d free / %d total", runtime.freeMemory(), runtime.totalMemory()));

		String[] str1 = new String[127255128];
		for(int i = 0; i < str1.length; i++) {
			unsafe.allocateMemory(2000);
		}

		System.out.println(String.format("%d free / %d total", runtime.freeMemory(), runtime.totalMemory()));

		char[] str2 = new char[127255128];
		for(int i = 0; i < str2.length; i++) {
			str2[i] = (char)i;
		}

		System.out.println(String.format("%d free / %d total", runtime.freeMemory(), runtime.totalMemory()));

		Thread.sleep(5000);
	}

}
