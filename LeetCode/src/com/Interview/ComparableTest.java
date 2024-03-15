package com.Interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableTest {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product(3, "PC"));
        products.add(new Product(4, "Mobile"));
        products.add(new Product(2, "Shirt"));
        products.add(new Product(1, "Belt"));

        products.sort(new Product());
        products.forEach(System.out::println);
    }
}
