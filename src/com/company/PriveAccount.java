package com.company;


public class PriveAccount extends AccountGenerator{
    private int BsnNummer;


    @Override
    public void ontvangenBetaling(double betaling){
        System.out.println("betaling ontvangen(prive-account)");
    }

    @Override
    public void generateAccountNummer() {
        System.out.println("Private Account Number generated");
        getBsnNummer();
    }

    @Override
    public void bevestiging() {
        System.out.println("Uw prive-account is aangemaakt");
    }


    public void getBsnNummer(){
        System.out.println("wat is uw BSN nummer?");
        BsnNummer = scanner.nextInt();
    }


}
