package com.ralph.services;

import java.util.Collection;
import java.util.logging.Logger;

import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.metrics.MetricRegistry;
import org.eclipse.microprofile.metrics.annotation.RegistryType;

import com.ralph.BaseApplication;
import com.ralph.data.NobelPrize;

/**
 *
 * @author rsoika
 */
@Path("data")
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class NobelPrizeResource {
    private static Logger logger = Logger.getLogger(NobelPrizeResource.class.getName());

    @Inject
    BaseApplication app;

    @Inject
    protected Event<APIEvent> apiEvents;
   
    @Inject
    @RegistryType(type = MetricRegistry.Type.APPLICATION)
    private MetricRegistry metricRegistry;
    
    /**
     * Getter Method to receive on element
     * 
     * @param id
     * @return NobelPrize
     */
    @GET
    @Path("/nobelprize/{id}")
    public NobelPrize getPrice(@PathParam("id") long id) {
        logger.info("...fetching: " + id);
        
        // fire an api event...
        NobelPrize data = app.getData().get(id);
        if (apiEvents != null) {
            apiEvents.fire(new APIEvent(data, APIEvent.ON_LOAD));
        } else {
            logger.warning("Missing CDI support for Event<APIEvent> !");
        }
        return data;
    }

    /**
     * Getter Method to receive all elements
     * 
     * @return collection of NobelPrize
     */
    @GET
    @Path("/nobelprize")
    public Collection<NobelPrize> getPriceList() {
        return app.getData().values();
    }

}
