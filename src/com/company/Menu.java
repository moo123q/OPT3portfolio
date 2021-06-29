package com.company;


import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
   BedragProcessor bedragprocessor = new BedragProcessor();
   Displayer displayer = Displayer.getInstance();
    public void startApplication() {



        bedragprocessor.gebruiker.getGegevens();
        System.out.println("Wilt u weten wat u maandelijks overhoudt?");
        String antwoord = scanner.nextLine();

        if (antwoord.equals("nee")) {
            bedragprocessor.gebruiker.spaardoel.vraagSpaardoel();
        }

        else {
            bedragprocessor.maandelijksuitgave.getVasteLastenGegevens();
            bedragprocessor.gebruiker.spaardoel.vraagSpaardoel();
            bedragprocessor.displayer.display(bedragprocessor.getBericht());
        }

        System.out.println("Hoeveel wilt u maandelijks sparen?");
        bedragprocessor.gebruiker.spaardoel.setGekozenBedrag(scanner.nextDouble());
        System.out.println("Uw spaardoel wordt behaald over " + bedragprocessor.gebruiker.spaardoel.berekenSpaarDuur() + " maanden");
    }
}
