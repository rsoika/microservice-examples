package com.ralph.spring;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement
public class Address {
	private String street;
	private String city;

	public Address() {
		super();
		street = "Lindenstr. 14";
		city = "München";
	} 

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
