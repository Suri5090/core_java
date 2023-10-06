package com.practice;

import java.util.TreeSet;

public class User {

	private int id;
	private String uname;
	private String uadd;
	
	public User(int id, String uname, String uadd) {
		this.id = id;
		this.uname = uname;
		this.uadd = uadd;
	}
	
	public int getId() {
		return id;
	}
	
	public String getUname() {
		return uname;
	}
	
	public String getUadd() {
		return uadd;
	}

	@Override
	public String toString() {
		return "User[uname=" + uname + ", uadd=" + uadd+"]";
	}
	
	public static void main(String[] args) {
		
		TreeSet<User> ts = new TreeSet<User>(new UserComparator());
		ts.add(new User(101, "Suresh", "Ker"));
		ts.add(new User(104, "Naresh", "Hyd"));
		ts.add(new User(102, "Somesh", "Ban"));
		ts.add(new User(100, "Ramesh", "Mum"));
		System.out.println(ts);
	}
}
