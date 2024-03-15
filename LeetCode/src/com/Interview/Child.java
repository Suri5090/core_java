package com.Interview;

public class Child extends Parent{

    Double fee;

    Child(int id, String name, Double fee){
        super(id, name);
        this.fee=fee;
    }

    @Override
    public void m1() {
        System.out.println(id+" "+name+" "+fee);
    }
}
