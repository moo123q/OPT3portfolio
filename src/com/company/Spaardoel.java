package com.company;

import java.util.Scanner;

public class Spaardoel {
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



    public int berekenSpaarDuur(){

        spaarDuur = (int) Math.ceil( (spaarBedrag / gekozenBedrag));

        return spaarDuur;
    }

}
