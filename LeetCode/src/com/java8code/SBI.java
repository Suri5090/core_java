package com.java8code;

public class SBI implements RBI{

    public void deposit() {
        System.out.println("SBI deposit");
    }

    public void withdraw() {
        System.out.println("SBI withdraw");
    }

    public void minBal(){
        System.out.println("You should maintain the min balance 1000 for SBI");
    }
    public void linkAadhar(){
        System.out.println("Your aadhar has been linked to SBI");
    }
}
