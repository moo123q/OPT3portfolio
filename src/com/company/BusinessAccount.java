package com.company;

public class BusinessAccount extends AccountGenerator{
    private int KvkNummer;

    @Override
    public void generateAccountNumber() {
        System.out.println("Business Account number generated");
    }

    @Override
    void getBsnNummer() {
    }

    @Override
    void getKvkNummer() {
        System.out.println("wat is uw Kvk nummer?");
        KvkNummer = scanner.nextInt();
    }
}
