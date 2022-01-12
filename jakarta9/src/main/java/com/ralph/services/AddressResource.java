package com.ralph.services;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

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
