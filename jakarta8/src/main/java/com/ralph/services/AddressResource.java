package com.ralph.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.ralph.data.Address;
import com.ralph.data.XMLCount;


/**
 *
 * @author rsoika
 */
@Path("data")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class AddressResource {

    @GET
    @Path("/address")
    /*
    public Address getAddress() {
        return new Address();
    }

	*/
	 public Response getAddressXML() {
		
	    return Response.status(Status.OK).entity(new Address()).build();

	    
	    
//		  return Response
//                  // Set the status and Put your entity here.
//                  .ok(new Address())
//                  .build();
	    }
	
	
    @GET
    @Path("/count")
	public XMLCount getCount() {
		XMLCount count= new XMLCount();
		count.count=(long) 5;
		return count;
	}
}
