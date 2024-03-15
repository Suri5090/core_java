package com.Interview;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ObjectCreate {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Student stud = new Student(10);
        System.out.println(stud.id);

        Student stud1 = Student.class.getDeclaredConstructor(int.class).newInstance(20);
        System.out.println(stud1.id);

    }
}
