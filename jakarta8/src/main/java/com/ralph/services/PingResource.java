package com.ralph.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author rsoika
 */
@Path("ping")
public class PingResource {

    @GET
    public String ping() {
    	return "Ping Jakarta8 "+System.currentTimeMillis();
    }

}
