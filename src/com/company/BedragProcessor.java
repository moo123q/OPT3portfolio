package com.company;

import java.util.Scanner;

public class BedragProcessor {
    Scanner scanner = new Scanner(System.in);
    MaandelijksUitgave maandelijksuitgave = new MaandelijksUitgave();
    Gebruiker gebruiker = new Gebruiker();

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
