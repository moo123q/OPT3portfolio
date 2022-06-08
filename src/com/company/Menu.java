package com.company;


import java.util.Locale;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    private Gebruiker gebruiker;


    public void gebruikerAanmaken() {
        gebruiker = new Gebruiker("", 0,0);
        System.out.println("Wat is uw naam?");
        gebruiker.setName(scanner.nextLine());
        System.out.println("Wat is uw Leeftijd?");
        gebruiker.setLeeftijd(scanner.nextInt());
        System.out.println("Wat is uw inkomen?");
        gebruiker.setInkomen(scanner.nextDouble());

    }

    public void startApplication() {

        gebruikerAanmaken();
        BedragProcessor bedragprocessor = new BedragProcessor(gebruiker);
        gebruiker.spaardoel.vraagSpaardoel();
        System.out.println("Wilt u weten wat u maandelijks overhoudt?");
        scanner.nextLine();

        String antwoord = scanner.nextLine();

        if(antwoord.toLowerCase().equals("ja")) {
            gebruiker.getMaandelijksuitgave().getVasteLastenGegevens();
            bedragprocessor.displayer.display(bedragprocessor.getBericht());
        }


        System.out.println("Wilt u een business of prive account?");
        String account = scanner.nextLine();


        if(account.toLowerCase().equals("prive")){
            PriveAccount priveAccount = new PriveAccount();
            priveAccount.maakAccount();
        }

        else{
            BusinessAccount businessAccount = new BusinessAccount();
            businessAccount.maakAccount();
        }

        System.out.println("Hoeveel wilt u maandelijks sparen?");

        while (true){
            gebruiker.spaardoel.setGekozenBedrag(scanner.nextDouble());
            if(gebruiker.spaardoel.getGekozenBedrag() > bedragprocessor.berekenOvergeblevenBedrag()){
                System.out.println("U wilt meer aan de kant zetten dan wat u maandelijks overhoudt! probeer het opnieuw.");
            }else
                break;

        }
        System.out.println("Uw spaardoel wordt behaald over " + gebruiker.spaardoel.berekenSpaarDuur() + " maand(en)");
    }
}
