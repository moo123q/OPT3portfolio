package com.company;

import java.text.DecimalFormat;

public class BedragProcessor {
    Displayer displayer = Displayer.getInstance();

    private Gebruiker gebruiker;

    public BedragProcessor(Gebruiker gebruiker) {
        this.gebruiker = gebruiker;
    }

    public double berekenOvergeblevenBedrag() {

        return gebruiker.getInkomen() - gebruiker.getMaandelijksuitgave().berekenTotaleUitgave();
    }

    public double berekenBetaalBedrag() {

        double betaalBedrag = (berekenBetaalPercentage(gebruiker.getInkomen(), gebruiker.getLeeftijd()) / 100);
        betaalBedrag = betaalBedrag * gebruiker.getSpaardoel().getSpaarBedrag();
        return betaalBedrag;

    }

    public double berekenBetaalPercentage(double inkomen, double leeftijd){
        double betaalPercentage = 0;

        if (leeftijd >= 18){
            betaalPercentage += controleerSpaarBedrag();
        }

        betaalPercentage += controleerInkomen(inkomen);

        return betaalPercentage;
    }

    private double controleerSpaarBedrag(){
        double spaarBedrag = gebruiker.getSpaardoel().getSpaarBedrag();

        if (spaarBedrag >= 0 && spaarBedrag <= 10000){
            return  1;
        }else if (spaarBedrag > 10000 && spaarBedrag <= 100000){
            return  0.12;
        }
            return  0.015;
    }

    private double controleerInkomen(double inkomen){
        if (inkomen >= 2500 && inkomen < 5000){
            return  0.1;
        } else if(inkomen >= 5000){
            return  0.02;
        }
        return 0;
    }


    public String getBericht() {

        return "Na het betalen van uw maanduitgave, behoudt u €" + berekenOvergeblevenBedrag() + " voor uwzelf\n" +
                "Het bedrag dat u moet Betalen is: €" + new DecimalFormat("##.##").format(berekenBetaalBedrag());


    }


}
