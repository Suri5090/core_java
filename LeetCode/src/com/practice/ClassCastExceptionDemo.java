package com.practice;
class Animal {
    public void eat(String str) {
        System.out.println("Eating for grass");
    }
}

class Goat extends Animal {
    public void eat(String str) {
        System.out.println("blank");
    }
}

class Dog extends Animal{
  public void eat(String str) {
        System.out.println("another");
  }
}
// If we are trying to hold the parent class object to the child reference then we will get CCE.
public class ClassCastExceptionDemo {
    public static void main(String[] args) {
        //Goat g =  (Goat) new Animal();
    }
}