package com.company;

import java.util.Scanner;

public class Gebruiker{


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


        public double berekenBetaalPercentage(double inkomen, double leeftijd){
        double betaalPercentage = 0;
        double percentageSpaardoel = inkomen * 0.6;

        double spaarBedrag = spaardoel.getSpaarBedrag();
        double totaleUitgave = maandelijksuitgave.berekenTotaleUitgave();

        if (spaarBedrag >= 0 && spaarBedrag <= 10000){
            betaalPercentage += 1;
        }


        if (spaarBedrag > 10000 && spaarBedrag <= 100000){
            betaalPercentage += 0.12;
        }


        if (spaarBedrag > 100000 ){
            betaalPercentage += 0.015;
        }


        if (leeftijd < 18){
            betaalPercentage = 0;
        }


        if (inkomen >= 2500){


            betaalPercentage += 0.1;
        }


        if (totaleUitgave <= percentageSpaardoel){


            betaalPercentage += 0.1;
        }
        return betaalPercentage;
    }

    public void getGegevens() {
        System.out.println("Wat is uw naam?");
        setName(scanner.nextLine());
        System.out.println("Wat is uw Leeftijd?");
        setLeeftijd(scanner.nextInt());
        System.out.println("Wat is uw inkomen?");
        setInkomen(scanner.nextDouble());
        System.out.println(getInkomen());
    }

    public void setLeeftijd(Integer leeftijd) {
        this.leeftijd = leeftijd;
    }

    public void setName(String name) {
        this.name = name;
    }
}
