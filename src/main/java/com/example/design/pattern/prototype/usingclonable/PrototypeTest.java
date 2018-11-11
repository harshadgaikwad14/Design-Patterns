package com.example.design.pattern.prototype.usingclonable;

public class PrototypeTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		/*
		 * When its easier to copy an existing object to 
		 * fully or partially to initialize a new one
		 *
		 * Using Clonable Copy object is not recommended its internally used shallow copy
		 */
		
		Employee e1=new Employee("Harshad", new Address("Mumbai", "India"));
		System.out.println(e1);
		/*Employee [name=Harshad, address=Address [city=Mumbai, country=India]]*/
		
		
		Employee e2= (Employee) e1.clone();
		e2.setName("Vivek");
		e2.getAddress().setCity("Pune");
		System.out.println(e2);
		/*Employee [name=Vivek, address=Address [city=Pune, country=India]]*/

	}

}
