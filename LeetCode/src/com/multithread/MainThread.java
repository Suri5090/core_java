package com.multithread;

public class MainThread {
    public static void main(String[] args) {
        Display d = new Display();
        MyThread t1 = new MyThread(d, "Dhoni");
        t1.start();
        Object ob = new Object();
        MyThread t2 = new MyThread(d, "Yuvi");
        t2.start();
    }
}
