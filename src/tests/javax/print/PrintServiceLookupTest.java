package tests.javax.print;

import java.util.Arrays;

import javax.print.DocFlavor;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;

import org.junit.Test;

public class PrintServiceLookupTest {

	@Test
	public void lookupTest() {
		PrintService[] prtSrv = PrintServiceLookup.lookupPrintServices(DocFlavor.SERVICE_FORMATTED.PRINTABLE, null);
		
		if (prtSrv != null) {
			Arrays.asList(prtSrv).stream().forEach(System.out::println);
		}
	}
	
}
