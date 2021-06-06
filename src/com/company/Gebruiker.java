package com.company;

import java.util.Scanner;

public class Gebruiker {


    Scanner scanner = new Scanner(System.in);
    Spaardoel spaardoel = new Spaardoel();
    MaandelijksUitgave maandelijksuitgave = new MaandelijksUitgave();
    private String name;
    private Integer leeftijd ;
    private double inkomen ;
    public Gebruiker(){

    }

    public String getName() {

        return name;
    }

    public Integer getLeeftijd() {
        return leeftijd;
    }

    public double getInkomen() {
        return inkomen;
    }

    public void setInkomen(double inkomen) {
        this.inkomen = inkomen;
    }

    double percentageSpaardoel = inkomen * 0.4;
    public double berekenBetaalPercentage(){



        double betaalPercentage = 0;

        if (spaardoel.getSpaarBedrag() >= 0 && spaardoel.getSpaarBedrag() <= 10000){
            betaalPercentage += 1;
        }


        if (spaardoel.getSpaarBedrag() > 10000 && spaardoel.getSpaarBedrag() <= 100000){
            betaalPercentage += 0.12;
        }


        if (spaardoel.getSpaarBedrag() > 100000 ){
            betaalPercentage += 0.015;
        }


        if (leeftijd < 18){
            betaalPercentage = 0;
        }


        if (inkomen >= 2500){


            betaalPercentage += 0.1;
        }


        if (maandelijksuitgave.berekenTotaleUitgave() <= percentageSpaardoel){


            betaalPercentage += 0.1;
        }
        return betaalPercentage;
    }

    public void getGegevens() {
        System.out.println("Wat is uw naam?");
        setName(scanner.nextLine());
        System.out.println("Wat is uw Leeftijd?");
        setLeeftijd(scanner.nextInt());
        System.out.println("Wat is uw maandelijks inkomen in €");
        setInkomen(scanner.nextDouble());
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
        spaardoel.setSpaarBedrag(scanner.nextDouble());
    }

    public void setLeeftijd(Integer leeftijd) {
        this.leeftijd = leeftijd;
    }

    public void setName(String name) {
        this.name = name;
    }
}
