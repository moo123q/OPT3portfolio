package com.company;

import java.text.DecimalFormat;

public class BedragProcessor {
    Displayer displayer = Displayer.getInstance();

    private Gebruiker gebruiker;

    public BedragProcessor(Gebruiker gebruiker) {
        this.gebruiker = gebruiker;
    }

    public double berekenOvergeblevenBedrag() {

        double overgeblevenBedrag = gebruiker.getInkomen() - gebruiker.getMaandelijksuitgave().berekenTotaleUitgave();

        return overgeblevenBedrag;
    }

    public double berekenBetaalBedrag() {

        double betaalBedrag = (berekenBetaalPercentage(gebruiker.getInkomen(), gebruiker.getLeeftijd()) / 100);
        betaalBedrag = betaalBedrag * gebruiker.spaardoel.getSpaarBedrag();
        return betaalBedrag;

    }

    public double berekenBetaalPercentage(double inkomen, double leeftijd){

        double spaarBedrag = gebruiker.spaardoel.getSpaarBedrag();

        double betaalPercentage = 0;

        if (spaarBedrag >= 0 && spaarBedrag <= 10000){
            betaalPercentage += 1;
        }else if (spaarBedrag > 10000 && spaarBedrag <= 100000){
            betaalPercentage += 0.12;
        } else {
            betaalPercentage += 0.015;
        }

        if (leeftijd < 18){
            betaalPercentage = 0;
        }

        if (inkomen >= 2500 && inkomen < 5000){
            betaalPercentage += 0.1;
        } else if(inkomen >= 5000){
            betaalPercentage += 0.02;
        }

        return betaalPercentage;
    }


    public String getBericht() {

        String bericht = "Na het betalen van uw maanduitgave, behoudt u €" + berekenOvergeblevenBedrag() + " voor uwzelf\n" +
                "Het bedrag dat u moet Betalen is: €" + new DecimalFormat("##.##").format(berekenBetaalBedrag());

        return bericht;
    }


}
