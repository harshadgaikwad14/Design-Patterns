package com.example.design.pattern.singleton.serializationproblem;

import java.io.Serializable;

public class SerializationSingleton implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int value;

	private SerializationSingleton() {

	}

	private final static SerializationSingleton INSTANCE = new SerializationSingleton();

	public static SerializationSingleton getSerializationSingletonInstance() {
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
		return "SerializationSingleton [value=" + value + "]";
	}
	
	
	protected Object readResolve()
	{
		return INSTANCE;
	}
	
	

}
