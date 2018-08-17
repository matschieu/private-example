package examples.cdi;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import examples.cdi.service.Application;

/**
 * @author Matschieu
 *
 */
public class Runner {

	public void start() {
		Weld weld = new Weld();
		weld.enableDevMode();
		WeldContainer container = weld.initialize();
		Application srv = container.select(Application.class).get();

		srv.run();

		container.shutdown();
	}

	public static void main(String[] args) {
		new Runner().start();
	}

}
