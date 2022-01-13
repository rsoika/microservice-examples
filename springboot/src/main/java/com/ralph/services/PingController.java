package com.ralph.services;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ralph.config.MailConfigProperties;

@RestController
@RequestMapping(value = "api")
public class PingController {
	private static Logger logger = Logger.getLogger(PingController.class.getName());

	private MailConfigProperties customProperties;

	public PingController(@Autowired MailConfigProperties customProperties) {
		this.customProperties = customProperties;

	}

	@RequestMapping("/ping")
	public String hello() {
		logger.info("ping... env mail.host=" + customProperties.getHost());
		return "Ping SpringBoot " + System.currentTimeMillis();
	}

}