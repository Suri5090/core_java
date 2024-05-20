package com.java8code;

public interface RBI {

    void deposit();
    void withdraw();
    default void minBal(){
        System.out.println("You should maintain the min balance with bank");
    }
    default void linkAadhar(){
        System.out.println("You should link the aadhar card with bank");
    }
}
