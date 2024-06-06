package com.jdbc;

public class Employee {

    private String name;
    private String job;
    private float sal;
    private int dno;

    public Employee(String name, String job, float sal, int dno) {
        this.name = name;
        this.job = job;
        this.sal = sal;
        this.dno = dno;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public float getSal() {
        return sal;
    }

    public int getDno() {
        return dno;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                ", dno=" + dno +
                '}';
    }
}
