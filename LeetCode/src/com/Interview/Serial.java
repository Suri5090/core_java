package com.Interview;

import com.sun.xml.internal.ws.developer.Serialization;

import java.io.Serializable;

public class Serial implements Serializable {

    int id;
    static String name;
    transient double fee;

    Serial(int id, String name, double fee){
        this.id=id;
        this.name=name;
        this.fee=fee;
    }

    @Override
    public String toString() {
        return "Serial{" +
                "id=" + id +
                ", name=" + name +
                ", fee=" + fee +
                '}';
    }
}
