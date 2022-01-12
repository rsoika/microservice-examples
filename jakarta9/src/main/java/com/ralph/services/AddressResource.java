package com.ralph.services;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.logging.Logger;

import com.ralph.data.Address;

/**
 *
 * @author rsoika
 */
@Path("data")
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class AddressResource {
	private static Logger logger = Logger.getLogger(AddressResource.class.getName());

	@GET
	@Path("/address/{id}")
	public Address getAddress(@PathParam("id") long id) {
		logger.info("...fetching address: " + id);
		return new Address(id);
	}

}