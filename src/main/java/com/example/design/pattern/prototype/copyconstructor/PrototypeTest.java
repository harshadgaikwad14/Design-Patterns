package com.example.design.pattern.prototype.copyconstructor;

public class PrototypeTest {

	public static void main(String[] args) {
		
		/*
		 * When its easier to copy an existing object to 
		 * fully or partially to initialize a new one
		 * 
		 *  Don't use when having a multiple object references in terms of has a relationship object
		 */
		
		Employee e1=new Employee("Harshad", new Address("Mumbai", "India"));
		System.out.println(e1);
		/*Employee [name=Harshad, address=Address [city=Mumbai, country=India]]*/
		
		
		Employee e2= new Employee(e1);
		e2.setName("Vivek");
		System.out.println(e2);
		/*Employee [name=Vivek, address=Address [city=Mumbai, country=India]]*/

	}

}
