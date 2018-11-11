package com.example.design.pattern.prototype.usingclonable;

public class Employee implements Cloneable {

	private String name;
	private Address address;

	public Employee(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
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

	@Override
	protected Object clone() throws CloneNotSupportedException {

		return new Employee(name, (Address) address.clone());
	}

}
