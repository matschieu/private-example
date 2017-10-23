package tests.java.util;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

/**
 * 
 * @author Matschieu
 *
 */
public class StreamTest {
	
	@Test
	public void test1() {
		new ArrayList<String>(Arrays.asList("bibi", "toto", "titi")).stream()
				.filter(val -> val.contains("i"))
				.forEach(System.out::println);
	}

}
