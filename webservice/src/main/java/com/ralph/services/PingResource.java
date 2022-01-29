package com.ralph.services;

import java.util.logging.Logger;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.eclipse.microprofile.config.inject.ConfigProperty;

/** 
 *
 * @author rsoika
 */
@WebService
public class PingResource {
	private static Logger logger = Logger.getLogger(PingResource.class.getName());

	@Inject
	@ConfigProperty(name = "mail.host", defaultValue = "xxxx")
	private String mail_host; 
	

	
	@WebMethod(operationName = "DescribeFoo")
	@WebResult(name = "Description")
	public String ping() {
		logger.info("...ping.... env mail.host=" + mail_host );
		return "Ping Jakarta8 Webservice " + System.currentTimeMillis();
	}

}
