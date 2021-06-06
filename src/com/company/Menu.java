package com.company;


public class Menu {
   BedragProcessor bedragprocessor = new BedragProcessor();
    public void startApplication() {


        bedragprocessor.gebruiker.getGegevens();
        bedragprocessor.getBericht();

    }
}
