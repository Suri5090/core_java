package com.Interview;

import java.io.*;

public class SerialDeserialClass {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Serial s = new Serial(10, "Suresh", 1000.00);
        System.out.println(s);
        FileOutputStream fos = new FileOutputStream("text.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s);

        FileInputStream fis= new FileInputStream("text.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Serial news = (Serial) ois.readObject();

        System.out.println(news);
    }
}
