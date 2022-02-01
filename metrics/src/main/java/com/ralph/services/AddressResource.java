package com.ralph.services;

import java.util.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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
	private static Logger logger = Logger.getLogger(AddressResource.class.getName());

	@GET
	@Path("/address/{id}")
	public Address getAddress(@PathParam("id") long id) {
		logger.info("...fetching address: " + id);
		return new Address(id);
	}

}
