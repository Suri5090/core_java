package com.java8code;

public class Bank {

    public static void main(String[] args) {
        RBI sbiBank = new SBI();
        sbiBank.deposit();
        sbiBank.withdraw();
        sbiBank.linkAadhar();
        sbiBank.minBal();

        System.out.println("------------------------------------------------------------");

        RBI axisBank = new Axis();
        axisBank.deposit();
        axisBank.withdraw();
        axisBank.linkAadhar();
        axisBank.minBal();
    }
}
