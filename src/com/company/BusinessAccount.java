package com.company;

public class BusinessAccount extends AccountGenerator{
    private int KvkNummer;

    @Override
    public void ontvangenBetaling(double betaling){
        System.out.println("betaling ontvangen(business-account)");
    }

    @Override
    public void generateAccountNummer() {
        System.out.println("Business Account number generated");
        getKvkNummer();
    }

    @Override
    public void bevestiging() {
        System.out.println("Uw business-account is aangemaakt");
    }


    public void getKvkNummer() {
        System.out.println("wat is uw Kvk nummer?");
        KvkNummer = scanner.nextInt();
    }
}
