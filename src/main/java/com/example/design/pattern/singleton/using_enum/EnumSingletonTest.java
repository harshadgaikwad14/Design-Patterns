package com.example.design.pattern.singleton.using_enum;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EnumSingletonTest {

	public static void saveToFile(final EnumSingleton bs, final String fileName)
			throws FileNotFoundException, IOException {
		try (FileOutputStream fos = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(bs);
		}
	}

	public static EnumSingleton readFile(final String fileName) throws ClassNotFoundException, IOException {
		try (FileInputStream fis = new FileInputStream(fileName); ObjectInputStream ois = new ObjectInputStream(fis)) {
			return (EnumSingleton) ois.readObject();
		}
	}

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		EnumSingleton instance1 = EnumSingleton.INSTANCE;
		instance1.setValue(500);
		saveToFile(instance1, "SerializeFile.ser");
		instance1.setValue(600);
		System.out.println("instance1" + instance1);

		EnumSingleton instance2 = readFile("SerializeFile.ser");
		System.out.println("instance2" + instance2);

		System.out.println("instance1 == instance2 : " + (instance1 == instance2));

	}

}
