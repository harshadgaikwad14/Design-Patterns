package com.example.design.pattern.prototype.copyconstructor;

public class Address {

	private String city;
	private String country;

	public Address(String city, String country) {
		super();
		this.city = city;
		this.country = country;
	}

	public Address(final Address other) {
		this(other.city, other.country);
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + "]";
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
