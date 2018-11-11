package com.example.design.pattern.singleton.staticblock;

public class StaticBlockSingleton {

	private int value;

	private StaticBlockSingleton() {

	}

	private static StaticBlockSingleton INSTANCE;

	static {

		try {
			INSTANCE = new StaticBlockSingleton();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static StaticBlockSingleton getStaticBlockSingletonInstance() {
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
		return "StaticBlockSingleton [value=" + value + "]";
	}

}
