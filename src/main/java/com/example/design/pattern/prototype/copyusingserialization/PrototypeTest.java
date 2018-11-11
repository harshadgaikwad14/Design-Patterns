package com.example.design.pattern.prototype.copyusingserialization;

import org.apache.commons.lang3.SerializationUtils;

public class PrototypeTest {

	public static void main(String[] args) {
		
		/*
		 * When its easier to copy an existing object to 
		 * fully or partially to initialize a new one
		 *
		 *	Best Approach for copying object using serialization
		 */
		
		Employee e1=new Employee("Harshad", new Address("Mumbai", "India"));
		System.out.println(e1);
		/*Employee [name=Harshad, address=Address [city=Mumbai, country=India]]*/
		
		
		Employee e2= SerializationUtils.roundtrip(e1);
		e2.setName("Vivek");
		System.out.println(e2);
		/*Employee [name=Vivek, address=Address [city=Mumbai, country=India]]*/

	}

}
