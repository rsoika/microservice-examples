package com.ralph.services;


import java.util.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 *
 * @author rsoika
 */
@Path("ping")
public class PingResource {
	private static Logger logger = Logger.getLogger(PingResource.class.getName());

	

	
	@GET
	public String ping() {
		
		return "Ping Jakarta8 " + System.currentTimeMillis();
	}

}
