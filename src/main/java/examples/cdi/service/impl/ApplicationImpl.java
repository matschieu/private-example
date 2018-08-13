package examples.cdi.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import examples.cdi.service.Application;
import examples.cdi.service.Service;

/**
 * @author Matschieu
 *
 */
@ApplicationScoped
public class ApplicationImpl implements Application {

	@Inject
	@Named("ServiceA")
	private Service service;

	private List<Service> services = new ArrayList<>();

	@Inject
	public ApplicationImpl(@Named("ServiceB") Service srv1, @Named("ServiceC") Service srv2) {
		services.add(srv1);
		services.add(srv2);
	}

	@PostConstruct
	public void postConstruct() {
		services.add(service);
	}

	@Override
	public void run() {
		System.out.println("Running the application");
		services.stream().forEach(srv -> srv.process());
	}

}
