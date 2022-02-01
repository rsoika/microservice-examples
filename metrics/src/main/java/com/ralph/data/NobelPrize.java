package com.ralph.data;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NobelPrize implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
    private int year;
	private String category;
	private Long id;

	public NobelPrize() {
		super();
	}

	public NobelPrize(String name, int year, String category, long id) {
        super();
        this.name = name;
        this.year = year;
        this.category = category;
        this.id=id;
    }

    public NobelPrize(Long id) {
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
	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @XmlElement
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    @XmlElement
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


}
