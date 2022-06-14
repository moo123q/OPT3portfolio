package com.company;


public class MaandelijksUitgave {
    private double huurPrijs;
    private double waterPrijs;
    private double stroomPrijs;
    private double boodschappenPrijs;

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
        return getBoodschappenPrijs() + getHuurPrijs() + getStroomPrijs() + getWaterPrijs();

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
}
