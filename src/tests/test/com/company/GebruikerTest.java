package com.company;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GebruikerTest {

    @Test
    void berekenBetaalPercentage1() {

        Gebruiker gebruiker = new Gebruiker();
        gebruiker.spaardoel.setSpaarBedrag(1);
        assertEquals(1, gebruiker.berekenBetaalPercentage(2499, 18));
    }

    @Test
    void berekenBetaalPercentage2() {

        Gebruiker gebruiker = new Gebruiker();
        gebruiker.spaardoel.setSpaarBedrag(1);
        assertEquals(0, gebruiker.berekenBetaalPercentage(2499, 17));
    }

    @Test
    void berekenBetaalPercentage3() {

        Gebruiker gebruiker = new Gebruiker();
        gebruiker.spaardoel.setSpaarBedrag(1);
        assertEquals(1.1, gebruiker.berekenBetaalPercentage(2500, 18));
    }

    @Test
    void berekenBetaalPercentage4() {

        Gebruiker gebruiker = new Gebruiker();
        gebruiker.spaardoel.setSpaarBedrag(1);
        assertEquals(1.02, gebruiker.berekenBetaalPercentage(5000, 18));

    }

    @Test
    void berekenBetaalPercentage5() {

        Gebruiker gebruiker = new Gebruiker();
        gebruiker.spaardoel.setSpaarBedrag(100001);
        assertEquals(0.015, gebruiker.berekenBetaalPercentage(1, 18));
    }

    @Test
    void berekenBetaalPercentage6() {

        Gebruiker gebruiker = new Gebruiker();
        gebruiker.spaardoel.setSpaarBedrag(10001);
        assertEquals(0.12, gebruiker.berekenBetaalPercentage(1, 18));
    }

    @Test
    void berekenBetaalPercentage7() {

        Gebruiker gebruiker = new Gebruiker();
        gebruiker.spaardoel.setSpaarBedrag(10000);
        assertEquals(1, gebruiker.berekenBetaalPercentage(1, 18));
    }
}