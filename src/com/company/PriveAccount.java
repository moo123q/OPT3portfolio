package com.company;


import java.util.Scanner;

public class PriveAccount extends AccountGenerator{
    private int BsnNummer;


    @Override
    public void ontvangenBetaling(double betaling){
        System.out.println("betaling ontvangen(prive-account)");
    }

    @Override
    public void generateAccountNummer(Scanner scanner) {
        System.out.println("wat is uw BSN nummer?");
        BsnNummer = super.getNummer(scanner);
        System.out.println("Private Account Number = " + BsnNummer);
    }

    @Override
    public void bevestiging() {
        System.out.println("Uw prive-account is aangemaakt");
    }

}
