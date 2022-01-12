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
        return "Enjoy Java EE 8!";
    }

}
