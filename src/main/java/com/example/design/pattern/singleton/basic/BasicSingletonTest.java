package com.example.design.pattern.singleton.basic;

public class BasicSingletonTest {

	public static void main(String[] args) {
		
		BasicSingleton  instance1= BasicSingleton.getBasicSingletonInstance();
		instance1.setValue(500);
		System.out.println(instance1);
		
		BasicSingleton  instance2= BasicSingleton.getBasicSingletonInstance();
		System.out.println(instance2);
		
		BasicSingleton  instance3= BasicSingleton.getBasicSingletonInstance();
		System.out.println(instance3);
	}

}
