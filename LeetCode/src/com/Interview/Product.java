package com.Interview;

import java.util.Comparator;

public class Product implements Comparable<Product>, Comparator<Product> {

    Integer id;
    String name;

    Product(){

    }

    Product(Integer id, String name){
        this.id=id;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compare(Product p1, Product p2) {
        return p1.name.compareTo(p2.name);
    }

    @Override
    public int compareTo(Product p) {
        return this.name.compareTo(p.name);
    }
}
