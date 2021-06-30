package com.company;

import java.util.Scanner;

public class Spaardoel {
    Scanner scanner = new Scanner(System.in);
    private double spaarBedrag;
    private double gekozenBedrag;
    private String spaarItem;
    private int spaarDuur;
    public Spaardoel(){

    }

    public double getSpaarBedrag() {
        return spaarBedrag;
    }

    public double getGekozenBedrag() {
        return gekozenBedrag;
    }

    public String getSpaarItem() {
        return spaarItem;
    }

    public void setSpaarBedrag(double spaarBedrag) {
        this.spaarBedrag = spaarBedrag;
    }

    public void setGekozenBedrag(double gekozenBedrag) {
        this.gekozenBedrag = gekozenBedrag;
    }

    public void setSpaarItem(String spaarItem) {
        this.spaarItem = spaarItem;
    }


    public void vraagSpaardoel(){
        System.out.println("Waar wilt u voor sparen?");
        setSpaarItem(scanner.nextLine());
        System.out.println("Wat is uw spaardoel?");
        setSpaarBedrag(scanner.nextDouble());
    }


    public int berekenSpaarDuur(){

        spaarDuur = (int) Math.ceil( (spaarBedrag / gekozenBedrag));

        return spaarDuur;
    }

}
