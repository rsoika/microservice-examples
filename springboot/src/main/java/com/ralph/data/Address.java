package com.ralph.data;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement
public class Address implements Serializable {

	private static final long serialVersionUID = 1L;
	private String street;
	private String city;
	private Long id;

	public Address() {
		super();
		street = "Lindenstr. 14";
		city = "München";
		id = (long) 42;
	}

	public Address(Long id) {
		this();
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
