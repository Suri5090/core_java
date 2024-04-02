package com.practice;

//import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapDemo extends Thread {

	//static HashMap<Integer, String> hm = new HashMap<Integer, String>();
	static ConcurrentHashMap<Integer, String> hm = new ConcurrentHashMap<Integer, String>();
	
	public void run() {
		
		try {
			Thread.sleep(1000);
			hm.put(4, "Somesh");
		}
		catch(InterruptedException e) {
			System.out.println("Child Thread going to add element");
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		hm.put(1, "Suresh");
		hm.put(2, "Ramesh");
		hm.put(3, "Naresh");
				
		HashMapDemo t = new HashMapDemo();
		
		t.start();
				
		for(Object o: hm.entrySet()) {
			System.out.println(o);
			Thread.sleep(1000);
		}
		System.out.println(hm);
	}
}
