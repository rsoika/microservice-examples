package com.ralph.services;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {
	 private static Logger logger = Logger.getLogger(PingController.class.getName());

	@RequestMapping("/ping")
	public String hello() {
		logger.info("ping...");
		return "Ping SpringBoot "+System.currentTimeMillis();
	}

}