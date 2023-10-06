package com.practice;

public class CustomImmutable {

    public static void main(String[] args) {

        Address address = new Address("Badvel", "Kadapa");
        Person person = new Person(101, "Suresh", address);
        System.out.println(person);

        Address newAdd = person.getAddress();
        newAdd.setCity("Pamuru");
        newAdd.setState("Nellore");

        System.out.println(person);
    }
}
