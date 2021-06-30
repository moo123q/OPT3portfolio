package com.company;

import java.util.Scanner;

public abstract class AccountGenerator{
    Scanner scanner = new Scanner(System.in);

    public void VerifierIdentificatiegegevens(){
        System.out.println("identificatiegegevens controleren");
    }

    public void verifierAccDetails(){
        System.out.println("Verifier je accountdetails");
    }


    public abstract void ontvangenBetaling(double betaling);
    public abstract void generateAccountNummer();
    public abstract void bevestiging();

    public void maakAccount(){
        this.VerifierIdentificatiegegevens();
        this.verifierAccDetails();
        this.ontvangenBetaling(10);
        this.bevestiging();
        this.generateAccountNummer();
    }
}
