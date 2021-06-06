package com.company;

import java.util.Scanner;

public class BedragProcessor {
    Scanner scanner = new Scanner(System.in);
    MaandelijksUitgave maandelijksuitgave = new MaandelijksUitgave();
    Gebruiker gebruiker = new Gebruiker();

    public void getGegevens() {
        System.out.println("Wat is uw naam");
        gebruiker.setName(scanner.nextLine());
        System.out.println("Wat is uw Leeftijd");
        gebruiker.setLeeftijd(scanner.nextInt());
        System.out.println("Wat is uw maandelijks inkomen in €");
        gebruiker.setInkomen(scanner.nextDouble());
        System.out.println("Wat betaalt u maandelijks aan huur?");
        maandelijksuitgave.setHuurPrijs(scanner.nextDouble());
        System.out.println("Wat betaalt u maandelijks aan gas?");
        maandelijksuitgave.setGasPrijs(scanner.nextDouble());
        System.out.println("Wat betaalt u aan maandelijks aan stroom?");
        maandelijksuitgave.setStroomPrijs(scanner.nextDouble());
        System.out.println("Wat betaalt u aan maandelijks aan boodschappen?");
        maandelijksuitgave.setBoodschappenPrijs(scanner.nextDouble());
        System.out.println("Wat betaalt u aan maandelijks aan water?");
        maandelijksuitgave.setWaterPrijs(scanner.nextDouble());
        System.out.println("Wat is uw spaardoel?");
        gebruiker.spaardoel.setSpaarBedrag(scanner.nextDouble());
    }




    public double berekenOvergeblevenBedrag() {

        double overgeblevenBedrag = gebruiker.getInkomen() - maandelijksuitgave.berekenTotaleUitgave();

        return overgeblevenBedrag;
    }

    public double berekenBetaalBedrag() {

        double betaalBedrag = (gebruiker.berekenBetaalPercentage() / 100);
        betaalBedrag = betaalBedrag * gebruiker.spaardoel.getSpaarBedrag();
        return betaalBedrag;

    }

    public void getBericht() {

        System.out.println("Na het betalen van uw maanduitgave, behoudt u €" + berekenOvergeblevenBedrag() + " voor uwzelf\n" +
                "Het bedrag dat u moet Betalen is: €" + berekenBetaalBedrag());

    }
}
