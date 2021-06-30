package com.company;

import java.text.DecimalFormat;

public class BedragProcessor {
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


    public String getBericht() {

        String bericht = "Na het betalen van uw maanduitgave, behoudt u €" + berekenOvergeblevenBedrag() + " voor uwzelf\n" +
                "Het bedrag dat u moet Betalen is: €" + new DecimalFormat("##.##").format(berekenBetaalBedrag());

        return bericht;
    }


}
