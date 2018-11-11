package com.example.design.pattern.singleton.basic;

public class BasicSingleton {

	private int value;

	private BasicSingleton() {

	}

	private final static BasicSingleton INSTANCE = new BasicSingleton();

	public static BasicSingleton getBasicSingletonInstance() {
		return INSTANCE;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "BasicSingleton [value=" + value + "]";
	}

}
