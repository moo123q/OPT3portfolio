package com.company;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class bedragProcessorTest {


    @Test
    void berekenBetaalPercentage1() {
        Gebruiker gebruiker = new Gebruiker("mo", 2499, 18);
        BedragProcessor bedragProcessor = new BedragProcessor(gebruiker);
        gebruiker.getSpaardoel().setSpaarBedrag(1);
        assertEquals(1, bedragProcessor.berekenBetaalPercentage(gebruiker.getInkomen(), gebruiker.getLeeftijd()));
    }

    @Test
    void berekenBetaalPercentage2() {
        Gebruiker gebruiker = new Gebruiker("mo", 2499, 17);
        BedragProcessor bedragProcessor = new BedragProcessor(gebruiker);
        gebruiker.getSpaardoel().setSpaarBedrag(1);
        assertEquals(0, bedragProcessor.berekenBetaalPercentage(gebruiker.getInkomen(), gebruiker.getLeeftijd()));
    }

    @Test
    void berekenBetaalPercentage3() {
        Gebruiker gebruiker = new Gebruiker("mo", 2500, 18);
        BedragProcessor bedragProcessor = new BedragProcessor(gebruiker);
        gebruiker.getSpaardoel().setSpaarBedrag(1);
        assertEquals(1.1, bedragProcessor.berekenBetaalPercentage(gebruiker.getInkomen(), gebruiker.getLeeftijd()));
    }

    @Test
    void berekenBetaalPercentage4() {
        Gebruiker gebruiker = new Gebruiker("mo", 5000, 18);
        BedragProcessor bedragProcessor = new BedragProcessor(gebruiker);
        gebruiker.getSpaardoel().setSpaarBedrag(1);
        assertEquals(1.02, bedragProcessor.berekenBetaalPercentage(gebruiker.getInkomen(), gebruiker.getLeeftijd()));

    }

    @Test
    void berekenBetaalPercentage5() {
        Gebruiker gebruiker = new Gebruiker("mo", 1, 18);
        BedragProcessor bedragProcessor = new BedragProcessor(gebruiker);
        gebruiker.getSpaardoel().setSpaarBedrag(100001);
        assertEquals(0.015, bedragProcessor.berekenBetaalPercentage(gebruiker.getInkomen(), gebruiker.getLeeftijd()));
    }

    @Test
    void berekenBetaalPercentage6() {
        Gebruiker gebruiker = new Gebruiker("mo", 1, 18);
        BedragProcessor bedragProcessor = new BedragProcessor(gebruiker);
        gebruiker.getSpaardoel().setSpaarBedrag(10001);
        assertEquals(0.12, bedragProcessor.berekenBetaalPercentage(gebruiker.getInkomen(), gebruiker.getLeeftijd()));
    }

    @Test
    void berekenBetaalPercentage7() {
        Gebruiker gebruiker = new Gebruiker("mo", 1, 18);
        BedragProcessor bedragProcessor = new BedragProcessor(gebruiker);
        gebruiker.getSpaardoel().setSpaarBedrag(10000);
        assertEquals(1, bedragProcessor.berekenBetaalPercentage(gebruiker.getInkomen(), gebruiker.getLeeftijd()));
    }
}