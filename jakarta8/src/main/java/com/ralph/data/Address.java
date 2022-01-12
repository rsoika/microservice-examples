package com.ralph.data;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Address implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String street;
	private String city;

	public Address() {
		//super();
		street = "Lindenstr. 14";
		city = "München";
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
