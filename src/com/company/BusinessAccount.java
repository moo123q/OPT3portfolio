package com.company;

import java.util.Scanner;

public class BusinessAccount extends AccountGenerator{
    private int KvkNummer;

    @Override
    public void ontvangenBetaling(double betaling){
        System.out.println("betaling ontvangen(business-account)");
    }

    @Override
    public void generateAccountNummer(Scanner scanner) {
        System.out.println("wat is uw Kvk nummer?");
        KvkNummer = super.getNummer(scanner);
        System.out.println("Business Account number = " + KvkNummer);
    }

    @Override
    public void bevestiging() {
        System.out.println("Uw business-account is aangemaakt");
    }

}
