package com.company;


public class Menu {
   BedragProcessor bedragprocessor = new BedragProcessor();
    public void startApplication() {


        bedragprocessor.gebruiker.getGegevens();
        bedragprocessor.maandelijksuitgave.getGeldGegevens();
        bedragprocessor.gebruiker.spaardoel.vraagSpaarbedrag();
        bedragprocessor.getBericht();
        System.out.println(bedragprocessor.maandelijksuitgave.getHuurPrijs());


    }
}
