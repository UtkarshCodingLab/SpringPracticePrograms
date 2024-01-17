package com.springconfiguration.removexmlannotation;

public class Address {
	
	private String area;
	
	private String city;
	
	private String country;

	public Address(String area, String city, String country) {
		super();
		this.area = area;
		this.city = city;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [area=" + area + ", city=" + city + ", country=" + country + "]";
	}
	
	

}
