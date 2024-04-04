package com.Interview;

public class DynamicBinding {
    public static void main(String[] args) {
        A a = new A();
        a.m1();
        A.m2();
        A a1 = new B();
        a1.m1();
        A.m2();
        B b = new B();
        b.m1();
        B.m2();
    }
}
