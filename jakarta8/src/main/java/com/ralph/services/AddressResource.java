package com.ralph.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ralph.data.Address;


/**
 *
 * @author rsoika
 */
@Path("data")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class AddressResource {

    @GET
    @Path("/address")
    public Address getAddress() {
        return new Address();
    }

}
