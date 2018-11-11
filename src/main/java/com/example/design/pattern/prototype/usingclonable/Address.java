package com.example.design.pattern.prototype.usingclonable;

public class Address implements Cloneable {

	private String city;
	private String country;

	public Address(String city, String country) {
		super();
		this.city = city;
		this.country = country;
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

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return new Address(this.city, this.country);
	}

}
