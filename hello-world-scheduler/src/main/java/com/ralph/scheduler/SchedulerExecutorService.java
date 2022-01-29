package com.ralph.scheduler;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.enterprise.concurrent.ManagedScheduledExecutorService;
import javax.inject.Inject;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import com.ralph.data.SchedulerStatus;
import com.ralph.services.PingResource;

@Startup
@Singleton
@LocalBean
public class SchedulerExecutorService {

    private static Logger logger = Logger.getLogger(PingResource.class.getName());

    @Inject
    @ConfigProperty(name = "inital.delay", defaultValue = "10000") // 10 sec
    private long initalDelay;

    @Inject
    @ConfigProperty(name = "period", defaultValue = "30000") // 30 sec
    private long period;

    private SchedulerStatus schedulerStatus = null;

    @Resource
    ManagedScheduledExecutorService scheduler;

    @Inject
    MyService myService;

    @PostConstruct
    public void init() {

        logger.info("*****************************************************************");
        logger.info("*...init scheduler service : initalDelay=" + initalDelay + " period=" + period);
        logger.info("*****************************************************************");

        // create status object
        schedulerStatus = new SchedulerStatus(initalDelay, period);

        this.scheduler.scheduleAtFixedRate(this::run, initalDelay, period, TimeUnit.MILLISECONDS);
    }

    public void run() {
        boolean result = myService.pushData();
        // update the status information
        schedulerStatus.setLastResult(result);
        schedulerStatus.setExecutions(schedulerStatus.getExecutions() + 1);
    }

    public SchedulerStatus getSchedulerStatus() {
        return schedulerStatus;
    }

}
