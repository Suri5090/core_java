package com.Interview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ThirdEmpDetails {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Suresh", 1000.0));
        list.add(new Employee(104, "Ramesh", 1500.0));
        list.add(new Employee(102, "Rajesh", 500.0));
        list.add(new Employee(103, "Mahesh", 3000.0));
        list.add(new Employee(103, "Mahesh", 2200.0));
        list.add(new Employee(103, "Mahesh", 1900.0));

        Employee emp = list.stream().sorted(Comparator.comparingDouble(Employee::getSal).reversed()).limit(3).skip(2).findFirst().orElse(null);
        System.out.println(emp);
    }
}
