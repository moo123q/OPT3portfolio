package com.company;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GebruikerTest {

    @Test
    void berekenBetaalPercentage1() {

        MaandelijksUitgave maandelijksUitgave = new MaandelijksUitgave();
        Gebruiker gebruiker = new Gebruiker();
        maandelijksUitgave.setBoodschappenPrijs(10);
        maandelijksUitgave.setStroomPrijs(10);
        maandelijksUitgave.setWaterPrijs(10);
        maandelijksUitgave.setHuurPrijs(10);
        gebruiker.spaardoel.setSpaarBedrag(300000);
        assertEquals(0.115, gebruiker.berekenBetaalPercentage(2499, 18));
    }

    @Test
    void berekenBetaalPercentage2() {

        MaandelijksUitgave maandelijksUitgave = new MaandelijksUitgave();
        Gebruiker gebruiker = new Gebruiker();
        maandelijksUitgave.setBoodschappenPrijs(10);
        maandelijksUitgave.setStroomPrijs(10);
        maandelijksUitgave.setWaterPrijs(10);
        maandelijksUitgave.setHuurPrijs(10);
        gebruiker.spaardoel.setSpaarBedrag(1);
        assertEquals(1.1, gebruiker.berekenBetaalPercentage(2499, 18));
    }

    @Test
    void berekenBetaalPercentage3() {

        MaandelijksUitgave maandelijksUitgave = new MaandelijksUitgave();
        Gebruiker gebruiker = new Gebruiker();
        maandelijksUitgave.setBoodschappenPrijs(10);
        maandelijksUitgave.setStroomPrijs(10);
        maandelijksUitgave.setWaterPrijs(10);
        maandelijksUitgave.setHuurPrijs(10);
        gebruiker.spaardoel.setSpaarBedrag(15000);
        assertEquals(0.32, gebruiker.berekenBetaalPercentage(2500, 18));
    }
}