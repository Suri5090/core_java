package com.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class StudentObjCreateDiffWays
{
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, 
												ClassNotFoundException, NoSuchMethodException, 
												SecurityException, IllegalArgumentException, 
												InvocationTargetException, IOException, CloneNotSupportedException {
	
		System.out.println("Using New Keyword");
		Student stud = new Student(101, "Suresh");
		System.out.println(stud.id);
		System.out.println();
		
		System.out.println("Using newInstanceMethod of class");
		Student stud1 = Student.class.getDeclaredConstructor(int.class, String.class).newInstance(102, "Ramesh");
		System.out.println(stud1.id);
		System.out.println();
		
		System.out.println("Using newInstanceMethod of class");
		Student stud2 = (Student) Class.forName("com.practice.Student").getDeclaredConstructor(int.class, String.class).newInstance(103, "Rajesh");
		System.out.println(stud2.id);
		System.out.println();

		System.out.println("Using Clone method");
		Student stud4 = (Student) stud2.clone();
		System.out.println(stud4.id);
		System.out.println();
		
		//Serialization
		
		FileOutputStream fos = new FileOutputStream("text.txt"); 
		ObjectOutputStream oos = new ObjectOutputStream(fos); 
		oos.writeObject(stud2);
		oos.close();
		
		System.out.println("Using De-Serialization");
		FileInputStream fis = new FileInputStream("text.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student stud5 = (Student) ois.readObject();
		stud5.id = 106;
		System.out.println(stud5.id);
		ois.close();
	}
}
