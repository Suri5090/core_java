package com.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileRead {

	public static void main(String[] args) throws Exception {
		
		File file = new File("/Core Java/src/com/interview/sample.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		while((st=br.readLine())!= null) {
			System.out.println(st);
		}
		br.close();
	}
}
