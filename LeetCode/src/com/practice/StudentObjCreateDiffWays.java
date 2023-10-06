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
		Student stud1 = Student.class.newInstance();
		stud1.id = 102;
		System.out.println(stud1.id);
		System.out.println();
		
		System.out.println("Using newInstanceMethod of class");
		Student stud2 = (Student) Class.forName("com.practice.Student").newInstance();
		stud2.id = 103;
		System.out.println(stud2.id);
		System.out.println();
		
		System.out.println("Using newInstanceMethod of Constructor");
		Constructor<Student> constr = Student.class.getConstructor();
		Student stud3 =	constr.newInstance();
		stud3.id = 104;
		System.out.println(stud3.id);
		System.out.println();
		
		System.out.println("Using Clone method");
		Student stud4 = (Student) stud3.clone();
		System.out.println(stud4.id);
		System.out.println();
		
		//Serialization
		
		FileOutputStream fos = new FileOutputStream("text.txt"); 
		ObjectOutputStream oos = new ObjectOutputStream(fos); 
		oos.writeObject(stud3); oos.close();
		
		System.out.println("Using De-Serialization");
		FileInputStream fis = new FileInputStream("text.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student stud5 = (Student) ois.readObject();
		stud5.id = 106;
		System.out.println(stud5.id);
		ois.close();
	}
}
