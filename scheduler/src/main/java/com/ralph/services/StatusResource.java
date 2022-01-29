package com.ralph.services;

import java.util.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ralph.data.SchedulerStatus;
import com.ralph.scheduler.SchedulerExecutorService;

/**
 * Status endpoint providing data about the scheduler configuration
 * 
 * http://localhost:8080/api/status
 * 
 * @author rsoika
 */
@Path("status")
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class StatusResource {
    private static Logger logger = Logger.getLogger(StatusResource.class.getName());

    @Inject
    SchedulerExecutorService schedulerExecutorService;

    @GET
    public SchedulerStatus getStatus() {
        logger.info("...get status info...");
        return schedulerExecutorService.getSchedulerStatus();
    }

}
