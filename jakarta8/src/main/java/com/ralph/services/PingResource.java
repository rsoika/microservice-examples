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
	private static Logger logger = Logger.getLogger(AddressResource.class.getName());

	@Inject
	@ConfigProperty(name = "client.password", defaultValue = "xxxx")
	private String env_password;
	
	@Inject
	@ConfigProperty(name = "mp.openapi.servers", defaultValue = "none")
	private String openapi_servers;
	
	@GET
	public String ping() {
		logger.info("env client.password=" + env_password + " , mp.openapi.servers=" + openapi_servers);
		return "Ping Jakarta8 " + System.currentTimeMillis();
	}

}
