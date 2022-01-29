package com.ralph.health;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Liveness;

/**
 * This is a basis HealthCheck example generating some data
 * 
 * @author rsoika
 *
 */

@Liveness
@ApplicationScoped
public class LivenessCheck implements HealthCheck {

	@Override
	public HealthCheckResponse call() {
		return HealthCheckResponse.named("ping").withData("ducke", "lives").up().build();
	}

}