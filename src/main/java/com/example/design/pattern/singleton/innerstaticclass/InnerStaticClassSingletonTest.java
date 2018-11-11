package com.example.design.pattern.singleton.innerstaticclass;

public class InnerStaticClassSingletonTest {

	public static void main(String[] args) {

		InnerStaticClassSingleton instance1 = InnerStaticClassSingleton.getInnerStaticClassSingletonInstance();
		instance1.setValue(500);
		System.out.println(instance1);

		InnerStaticClassSingleton instance2 = InnerStaticClassSingleton.getInnerStaticClassSingletonInstance();
		System.out.println(instance2);

		System.out.println("instance1 == instance2 : " + (instance1 == instance2));
	}

}
