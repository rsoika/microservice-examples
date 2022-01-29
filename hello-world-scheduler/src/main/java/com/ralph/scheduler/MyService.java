package com.ralph.scheduler;

import java.util.logging.Logger;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.ralph.services.PingResource;

@Stateless
@LocalBean
public class MyService {
    
    private static Logger logger = Logger.getLogger(MyService.class.getName());

    
    public boolean pushData() {
        logger.info("...pushing some data....");
        return true;
    }

}
