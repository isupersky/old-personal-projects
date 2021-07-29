package com.jpqlexample.jpqlclass.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String state;
	private Integer zipcode;
	private String country;
	
	public Address() {
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public Integer getZipcode() {
		return zipcode;
	}
	
	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
}
