package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BedragProcessor {
    Scanner scanner = new Scanner(System.in);
    Displayer displayer = Displayer.getInstance();
    MaandelijksUitgave maandelijksuitgave = new MaandelijksUitgave();
    Gebruiker gebruiker = new Gebruiker();

    public double berekenOvergeblevenBedrag() {

        double overgeblevenBedrag = gebruiker.getInkomen() - maandelijksuitgave.berekenTotaleUitgave();

        return overgeblevenBedrag;
    }

    public double berekenBetaalBedrag() {

        double betaalBedrag = (gebruiker.berekenBetaalPercentage(gebruiker.getInkomen(), gebruiker.getLeeftijd()) / 100);
        betaalBedrag = betaalBedrag * gebruiker.spaardoel.getSpaarBedrag();
        return betaalBedrag;

    }

    String bericht;

    public String getBericht() {

        bericht = "Na het betalen van uw maanduitgave, behoudt u €" + berekenOvergeblevenBedrag() + " voor uwzelf\n" +
                "Het bedrag dat u moet Betalen is: €" + new DecimalFormat("##.##").format(berekenBetaalBedrag());

        return bericht;
    }


}
