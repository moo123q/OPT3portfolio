package com.company;


public class Gebruiker{


    private String name;
    private Integer leeftijd ;
    private double inkomen ;

    private MaandelijksUitgave maandelijksuitgave;
    private Spaardoel spaardoel;

    public Gebruiker(String name, double inkomen, Integer leeftijd){
        this.name = name;
        this.inkomen= inkomen;
        this.leeftijd = leeftijd;
        this.maandelijksuitgave = new MaandelijksUitgave();
        this.spaardoel = new Spaardoel();
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

    public void setLeeftijd(Integer leeftijd) {
        this.leeftijd = leeftijd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MaandelijksUitgave getMaandelijksuitgave() {
        return maandelijksuitgave;
    }

    public void setMaandelijksuitgave(MaandelijksUitgave maandelijksuitgave) {
        this.maandelijksuitgave = maandelijksuitgave;
    }

    public Spaardoel getSpaardoel() {
        return spaardoel;
    }

    public void setSpaardoel(Spaardoel spaardoel) {
        this.spaardoel = spaardoel;
    }
}
