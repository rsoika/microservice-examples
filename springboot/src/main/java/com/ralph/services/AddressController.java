package com.ralph.services;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ralph.data.Address;

/**
*
* @author rsoika
*/
@RestController
@RequestMapping(value = "api", produces = { "application/json", "application/xml", "text/xml" })
public class AddressController {
	private static Logger logger = Logger.getLogger(AddressController.class.getName());

	@RequestMapping("/address/{id}")
	public Address getAddress(@PathVariable("id") long id) {
		logger.info("...fetching address: ");
		return new Address(id);
	}

}