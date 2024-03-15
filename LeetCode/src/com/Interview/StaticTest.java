package com.Interview;

public class StaticTest{
    public static void main(String[] args) {
        A a = new A();
        a.m1();
        a.m2();
        A a1 = new B();
        a1.m1();
        a1.m2();
        B b = new B();
        b.m1();
        b.m2();
    }
}
