package com.example.design.pattern.singleton.lazyandthreadsafe.instance;

public class LazyAndThreadSafeSingleton {

	private int value;

	private LazyAndThreadSafeSingleton() {

	}

	private static LazyAndThreadSafeSingleton INSTANCE;

	public static LazyAndThreadSafeSingleton getLazyAndThreadSafeSingletonInstance() {

		if (INSTANCE == null) {
			synchronized (LazyAndThreadSafeSingleton.class) {

				if (INSTANCE == null) {
					INSTANCE = new LazyAndThreadSafeSingleton();
				}

			}
		}

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
		return "LazyAndThreadSafeSingleton [value=" + value + "]";
	}

}
