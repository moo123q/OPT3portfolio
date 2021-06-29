package com.company;

public class Displayer {

    private static Displayer displayer = new Displayer();

    private Displayer(){


    }
    public static Displayer getInstance(){

        return displayer;

    }

    public void display(String bericht){
    System.out.println(bericht);
    }
}
