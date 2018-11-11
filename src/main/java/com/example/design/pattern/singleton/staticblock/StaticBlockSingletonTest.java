package com.example.design.pattern.singleton.staticblock;

public class StaticBlockSingletonTest {

	public static void main(String[] args) {
		
		StaticBlockSingleton  instance1= StaticBlockSingleton.getStaticBlockSingletonInstance();
		instance1.setValue(500);
		System.out.println(instance1);
		
		
		StaticBlockSingleton  instance2= StaticBlockSingleton.getStaticBlockSingletonInstance();
		System.out.println(instance2);
		
		System.out.println("instance1 == instance2 : " + (instance1 == instance2));
		
	}

}
