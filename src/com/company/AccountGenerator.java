package com.company;

import java.util.Scanner;

public class AccountGenerator{
    Scanner scanner = new Scanner(System.in);
    Gebruiker gebruiker = new Gebruiker();

    public void VeriefierIdentificatiegegevens(){
        System.out.println("identificatiegegevens controleren");
        System.out.println("kloppen uw gegevens?");
        String aw = scanner.nextLine();
        if (aw.equals("nee")) {
            System.out.println("Wat is uw naam?" + gebruiker.getInkomen());
            gebruiker.setName(scanner.nextLine());
            System.out.println("Wat is uw Leeftijd?");
            gebruiker.setLeeftijd(scanner.nextInt());
            System.out.println("Wat is uw inkomen?");
            gebruiker.setInkomen(scanner.nextDouble());
        }
    }

    public void verifyApplicationDetails(){
        System.out.println("Verifier je accountdetails");
    }



    public void ontvangenBetaling(double betaling){
        System.out.println("betaling ontvangen");
    }

    public  void generateAccountNumber(){

    }


    public void createAccount(){
        this.VeriefierIdentificatiegegevens();
        this.verifyApplicationDetails();
        this.ontvangenBetaling(10);
        this.generateAccountNumber();
    }
}
