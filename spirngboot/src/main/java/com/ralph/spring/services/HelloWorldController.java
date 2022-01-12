package com.ralph.spring.services;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ralph.spring.Address;

@RestController
public class HelloWorldController {

	@RequestMapping("/hello")
	public String hello() {
		return "Hello World !";
	}

	@RequestMapping("/address")
	public Address getAddress() {
		return new Address();
	}

	@RequestMapping(value = "/addressxml", method = RequestMethod.GET, produces = { "application/xml",
			"text/xml" }, consumes = MediaType.ALL_VALUE)
	@ResponseBody
	public Address getAddressXML() {
		return new Address();
	}
}