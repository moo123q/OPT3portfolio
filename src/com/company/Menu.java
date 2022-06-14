package com.company;

import java.util.Scanner;

public class Menu {
    private Gebruiker gebruiker;
    private Scanner scanner = new Scanner(System.in);


    public void gebruikerAanmaken() {
        gebruiker = new Gebruiker("", 0,0);
        System.out.println("Wat is uw naam?");
        gebruiker.setName(scanner.nextLine());
        System.out.println("Wat is uw Leeftijd?");
        gebruiker.setLeeftijd(scanner.nextInt());
        System.out.println("Wat is uw inkomen?");
        gebruiker.setInkomen(scanner.nextDouble());

    }

    public void getVasteLastenGegevens() {

        MaandelijksUitgave maandelijksUitgave = gebruiker.getMaandelijksuitgave();

        System.out.println("Wat betaalt u maandelijks aan huur?");
        maandelijksUitgave.setHuurPrijs(scanner.nextDouble());
        System.out.println("Wat betaalt u aan maandelijks aan stroom?");
        maandelijksUitgave.setStroomPrijs(scanner.nextDouble());
        System.out.println("Wat betaalt u aan maandelijks aan boodschappen?");
        maandelijksUitgave.setBoodschappenPrijs(scanner.nextDouble());
        System.out.println("Wat betaalt u aan maandelijks aan water?");
        maandelijksUitgave.setWaterPrijs(scanner.nextDouble());
    }

    public void vraagSpaardoel(){
        Spaardoel spaardoel = gebruiker.spaardoel;
        System.out.println("Waar wilt u voor sparen?");
        spaardoel.setSpaarItem(scanner.nextLine());
        System.out.println("Wat is uw spaardoel?");
        spaardoel.setSpaarBedrag(scanner.nextDouble());
    }

    public void startApplication() {

        gebruikerAanmaken();
        BedragProcessor bedragprocessor = new BedragProcessor(gebruiker);
//        gebruiker.spaardoel.vraagSpaardoel(scanner);
        vraagSpaardoel();
        System.out.println("Wilt u weten wat u maandelijks overhoudt?");
        scanner.nextLine();

        String antwoord = scanner.nextLine();

        if(antwoord.toLowerCase().equals("ja")) {
//            gebruiker.getMaandelijksuitgave().getVasteLastenGegevens(scanner);
            getVasteLastenGegevens();
            bedragprocessor.displayer.display(bedragprocessor.getBericht());
        }


        System.out.println("Wilt u een business of prive account?");
        String account = scanner.nextLine();


        if(account.toLowerCase().equals("prive")){
            PriveAccount priveAccount = new PriveAccount();
            priveAccount.maakAccount(scanner);
        }

        else{
            BusinessAccount businessAccount = new BusinessAccount();
            businessAccount.maakAccount(scanner);
        }

        System.out.println("Hoeveel wilt u maandelijks sparen?");

        while (true){
            gebruiker.spaardoel.setGekozenBedrag(scanner.nextDouble());
            if(gebruiker.spaardoel.getGekozenBedrag() > bedragprocessor.berekenOvergeblevenBedrag()){
                System.out.println("U wilt meer aan de kant zetten dan wat u maandelijks overhoudt! probeer het opnieuw.");
            }else
                break;
        }
        scanner.close();
        System.out.println("Uw spaardoel wordt behaald over " + gebruiker.spaardoel.berekenSpaarDuur() + " maand(en)");
    }
}
