package com.Interview;

public abstract class Parent {
    int id;
    String name;

    public Parent(int id, String name) {
        this.id=id;
        this.name=name;
    }

    public abstract void m1();
}