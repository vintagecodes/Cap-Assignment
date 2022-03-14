package com.example.demo.zipcode;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ZipCode {
	
	@JsonIgnore
	private long zipCode;
	private String state;
	private String city;
	private String country;
	public ZipCode() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ZipCode(long zipCode, String state, String city, String country) {
		super();
		this.zipCode = zipCode;
		this.state = state;
		this.city = city;
		this.country = country;
	}
	public long getZipCode() {
		return zipCode;
	}
	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
