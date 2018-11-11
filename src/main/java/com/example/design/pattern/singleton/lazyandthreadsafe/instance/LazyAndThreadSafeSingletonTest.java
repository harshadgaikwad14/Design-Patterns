package com.example.design.pattern.singleton.lazyandthreadsafe.instance;

public class LazyAndThreadSafeSingletonTest {

	public static void main(String[] args) {

		LazyAndThreadSafeSingleton instance1 = LazyAndThreadSafeSingleton.getLazyAndThreadSafeSingletonInstance();
		instance1.setValue(500);
		System.out.println(instance1);

		LazyAndThreadSafeSingleton instance2 = LazyAndThreadSafeSingleton.getLazyAndThreadSafeSingletonInstance();
		System.out.println(instance2);

		System.out.println("instance1 == instance2 : " + (instance1 == instance2));
	}

}
