package com.ralph.health;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Liveness;

import com.ralph.BaseApplication;

/**
 * This is a basis HealthCheck example generating some data
 * 
 * @author rsoika
 *
 */

@Liveness
@ApplicationScoped
public class LivenessCheck implements HealthCheck {

    @Inject
    BaseApplication app;
    
	@Override
	public HealthCheckResponse call() {
		return HealthCheckResponse.named("NobelPrize").withData("datasize", app.getData().size()).up().build();
	}

}