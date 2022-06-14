package com.company;

import java.util.Scanner;

public abstract class AccountGenerator{

    public void VerifierIdentificatiegegevens(){
        System.out.println("identificatiegegevens controleren");
    }

    public void verifierAccDetails(){
        System.out.println("Verifier je accountdetails");
    }


    public abstract void ontvangenBetaling(double betaling);
    public abstract void generateAccountNummer(Scanner scanner);
    public abstract void bevestiging();

    public void maakAccount(Scanner scanner){
        this.VerifierIdentificatiegegevens();
        this.verifierAccDetails();
        this.ontvangenBetaling(10);
        this.bevestiging();
        this.generateAccountNummer(scanner);
    }

    public int getNummer(Scanner scanner) {
        return scanner.nextInt();
    }
}
