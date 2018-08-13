package examples.cdi.service.impl;

import examples.cdi.service.Service;

/**
 * @author Matschieu
 *
 */
public class AbstractService implements Service {

	@Override
	public void process() {
		System.out.println("Processing service " + this.getClass().getSimpleName());
	}

}
