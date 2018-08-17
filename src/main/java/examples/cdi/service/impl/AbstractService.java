package examples.cdi.service.impl;

import javax.annotation.PostConstruct;

import examples.cdi.service.Service;

/**
 * @author Matschieu
 *
 */
public class AbstractService implements Service {

	@PostConstruct
	public void postConstruct() {
		System.out.println("Instanciating " + this.getClass().getSimpleName());
	}

	@Override
	public void process() {
		System.out.println("Processing service " + this.getClass().getSimpleName());
	}

}
