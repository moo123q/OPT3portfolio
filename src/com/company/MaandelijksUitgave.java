package com.company;

import java.util.Scanner;

public class MaandelijksUitgave {
    private double huurPrijs;
    private double waterPrijs;
    private double stroomPrijs;
    private double boodschappenPrijs;
    Scanner scanner = new Scanner(System.in);

    public MaandelijksUitgave(){
    }

    public double getStroomPrijs() {
        return stroomPrijs;
    }

    public double getHuurPrijs() {
        return huurPrijs;
    }


    public double getWaterPrijs() {
        return waterPrijs;
    }

    public double getBoodschappenPrijs() {
        return boodschappenPrijs;
    }
    public double berekenTotaleUitgave(){
        double totaleUitgave = getBoodschappenPrijs() + getHuurPrijs() + getStroomPrijs() + getWaterPrijs();
        return totaleUitgave;
    }


    public void setHuurPrijs(double huurPrijs) {
        this.huurPrijs = huurPrijs;
    }


    public void setWaterPrijs(double waterPrijs) {
        this.waterPrijs = waterPrijs;
    }

    public void setStroomPrijs(double stroomPrijs) {
        this.stroomPrijs = stroomPrijs;
    }

    public void setBoodschappenPrijs(double boodschappenPrijs) {
        this.boodschappenPrijs = boodschappenPrijs;
    }


    public void getVasteLastenGegevens() {

        System.out.println("Wat betaalt u maandelijks aan huur?");
        setHuurPrijs(scanner.nextDouble());
        System.out.println("Wat betaalt u aan maandelijks aan stroom?");
        setStroomPrijs(scanner.nextDouble());
        System.out.println("Wat betaalt u aan maandelijks aan boodschappen?");
        setBoodschappenPrijs(scanner.nextDouble());
        System.out.println("Wat betaalt u aan maandelijks aan water?");
        setWaterPrijs(scanner.nextDouble());
    }
}
