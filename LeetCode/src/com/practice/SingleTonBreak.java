package com.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class SingleTonBreak {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, CloneNotSupportedException {
	
		SingleTon objOne = SingleTon.getInstance();
		System.out.println(objOne.hashCode());
		System.out.println("************************* Using Reflection *********************");
		
		SingleTon objTwo = null;
		try {
			Constructor<SingleTon> constr = SingleTon.class.getDeclaredConstructor();
			constr.setAccessible(true);
			objTwo = (SingleTon) constr.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(objTwo.hashCode());
		
		System.out.println("************************* Using Deserialization *********************");
		
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("simple.txt"));
		out.writeObject(objOne);
		out.close();
		
		ObjectInput in = new ObjectInputStream(new FileInputStream("simple.txt"));
		SingleTon objThree = (SingleTon) in.readObject();
		in.close();
		System.out.println(objThree.hashCode());
		
		System.out.println("************************* Using Cloning *********************");
		
		SingleTon objFour = (SingleTon) objOne.clone();
		
		System.out.println(objFour.hashCode());
	}
}
