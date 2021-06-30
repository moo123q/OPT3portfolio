package com.company;

public class BusinessAccount extends AccountGenerator{

    @Override
    public void generateAccountNumber() {
        System.out.println("Business Account number generated");
    }
}
