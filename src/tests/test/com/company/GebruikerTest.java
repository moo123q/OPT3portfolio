package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GebruikerTest {

    @Test
    void berekenBetaalPercentage() {

        MaandelijksUitgave maandelijksUitgave = new MaandelijksUitgave();
        Gebruiker gebruiker = new Gebruiker();
        maandelijksUitgave.setBoodschappenPrijs(10);
        maandelijksUitgave.setStroomPrijs(10);
        maandelijksUitgave.setWaterPrijs(10);
        maandelijksUitgave.setHuurPrijs(10);
        gebruiker.spaardoel.setSpaarBedrag(300000);
        assertEquals(1.2, gebruiker.berekenBetaalPercentage(500,19));

    }
}