package com.company;

import java.util.Scanner;

public abstract class AccountGenerator{
    Scanner scanner = new Scanner(System.in);
    Gebruiker gebruiker = new Gebruiker();

    public void VeriefierIdentificatiegegevens(){
        System.out.println("identificatiegegevens controleren");
    }

    public void verifyApplicationDetails(){
        System.out.println("Verifier je accountdetails");
    }


    public void ontvangenBetaling(double betaling){
        System.out.println("betaling ontvangen");
    }

    public abstract void generateAccountNumber();

     abstract void getBsnNummer();
     abstract void getKvkNummer();

    public void createAccount(){
        this.VeriefierIdentificatiegegevens();
        this.verifyApplicationDetails();
        this.getBsnNummer();
        this.getKvkNummer();
        this.ontvangenBetaling(10);
        this.generateAccountNumber();
    }
}
