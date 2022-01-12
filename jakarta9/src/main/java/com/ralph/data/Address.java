package com.ralph.data;

import java.io.Serializable;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Address implements Serializable {

	private static final long serialVersionUID = 1L;
	private String street;
	private String city;
	private Long id;

	public Address() {
		// super();
		street = "Lindenstr. 14";
		city = "München";
		id = (long) 42;
	}

	public Address(Long id) {
		this();
		this.id = id;
	}

	@XmlElement
	public long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@XmlElement
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@XmlElement
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
