package com.example.design.pattern.singleton.innerstaticclass;

public class InnerStaticClassSingleton {

	/*
	 * This Singleton is used for avoid synchronization block
	 * 
	 * Using Static Inner Class you can achieve threadSafety in singleton class
	 */

	private int value;

	private InnerStaticClassSingleton() {

	}

	private static class InnerStaticClassImpl {
		private static InnerStaticClassSingleton INSTANCE = new InnerStaticClassSingleton();

	}

	public static InnerStaticClassSingleton getInnerStaticClassSingletonInstance() {

		return InnerStaticClassImpl.INSTANCE;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "InnerStaticClassSingleton [value=" + value + "]";
	}

}
