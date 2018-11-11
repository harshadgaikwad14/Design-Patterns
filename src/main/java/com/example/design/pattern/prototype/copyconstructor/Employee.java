package com.example.design.pattern.prototype.copyconstructor;

public class Employee {

	private String name;
	private Address address;

	public Employee(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	public Employee(Employee other)
	{
		this.name = other.name;
		this.address= new Address(other.address);
		
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	
	

}
