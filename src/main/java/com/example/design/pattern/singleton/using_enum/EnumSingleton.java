package com.example.design.pattern.singleton.using_enum;

public enum EnumSingleton {
	
	
	/*
	 * This Singleton is used for solved the problem of Reflection
	 * 
	 * Enum have bydefault  private Constructor and implement serializable interface
	 */

	INSTANCE;

	private int value;

	EnumSingleton() {
		value = 55;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "EnumSingleton [value=" + value + "]";
	}

}
