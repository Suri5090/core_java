package com.practice;

public final class Person {

	final private int id;
	final private String name;
	final private Address address;

	public Person(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public Address getAddress() {
		return new Address(address);
		//return Address.getInstance(address);
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
}
