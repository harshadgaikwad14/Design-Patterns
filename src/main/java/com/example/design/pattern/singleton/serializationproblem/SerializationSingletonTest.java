package com.example.design.pattern.singleton.serializationproblem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationSingletonTest {

	public static void saveToFile(final SerializationSingleton bs, final String fileName)
			throws FileNotFoundException, IOException {
		try (FileOutputStream fos = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(bs);
		}
	}

	public static SerializationSingleton readFile(final String fileName) throws ClassNotFoundException, IOException {
		try (FileInputStream fis = new FileInputStream(fileName); ObjectInputStream ois = new ObjectInputStream(fis)) {
			return (SerializationSingleton) ois.readObject();
		}
	}

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		SerializationSingleton instance1 = SerializationSingleton.getSerializationSingletonInstance();
		instance1.setValue(500);
		saveToFile(instance1, "SerializeFile.ser");
		instance1.setValue(600);
		System.out.println("instance1"+instance1);

		
		SerializationSingleton instance2 = readFile("SerializeFile.ser");
		System.out.println("instance2"+instance2);

		System.out.println("instance1 == instance2 : " + (instance1 == instance2));

	}

}
