package com.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	transient String str = "Venkat";
	
	static int x = 10;
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		SerializationDemo sd = new SerializationDemo();
		
		FileOutputStream fos = new FileOutputStream("text.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(sd);
		
		FileInputStream fis = new FileInputStream("text.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		SerializationDemo out = (SerializationDemo) ois.readObject();
		
		oos.close();
		ois.close();
		System.out.println(out.str);
		System.out.println(SerializationDemo.x);
	}
}
