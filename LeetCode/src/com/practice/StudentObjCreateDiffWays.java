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
		Student stud = new Student();
		stud.id = 100;
		System.out.println(stud);
		System.out.println();

		System.out.println("Using newInstanceMethod of class");
		Student stud1 = Student.class.newInstance();
		stud1.id = 101;
		System.out.println(stud1);
		System.out.println();
		
		System.out.println("Using newInstanceMethod of class");
		Student stud2 = (Student) Class.forName("com.practice.Student").newInstance();
		stud2.id = 102;
		System.out.println(stud2);
		System.out.println();

		System.out.println("Using Clone method");
		Student stud3 = (Student) stud1.clone();
		System.out.println(stud3);
		System.out.println();
		
		//Serialization
		
		FileOutputStream fos = new FileOutputStream("text.txt"); 
		ObjectOutputStream oos = new ObjectOutputStream(fos); 
		oos.writeObject(stud2);
		oos.close();
		
		System.out.println("Using De-Serialization");
		FileInputStream fis = new FileInputStream("text.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student stud4 = (Student) ois.readObject();
		System.out.println(stud4);
		ois.close();
	}
}
