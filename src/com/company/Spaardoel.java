package com.company;

import java.util.Scanner;

public class Spaardoel {
    private double spaarBedrag;
    private double gekozenMaandBedrag;
    private String spaarItem;

    public Spaardoel(){

    }

    public double getSpaarBedrag() {
        return spaarBedrag;
    }

    public double getGekozenMaandBedrag() {
        return gekozenMaandBedrag;
    }

    public String getSpaarItem() {
        return spaarItem;
    }

    public void setSpaarBedrag(double spaarBedrag) {
        this.spaarBedrag = spaarBedrag;
    }

    Scanner scanner = new Scanner(System.in);

    public void vraagSpaarbedrag(){
        System.out.println("Wat is uw spaardoel?");
        setSpaarBedrag(scanner.nextDouble());
    }
}
