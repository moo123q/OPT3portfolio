package com.company;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaandelijksUitgaveTest {

    @Test
    void berekenTotaleUitgave() {
        MaandelijksUitgave maandelijksUitgave = new MaandelijksUitgave();
        maandelijksUitgave.setBoodschappenPrijs(100);
        maandelijksUitgave.setHuurPrijs(100);
        maandelijksUitgave.setStroomPrijs(100);
        maandelijksUitgave.setWaterPrijs(100);
        assertEquals(400, maandelijksUitgave.berekenTotaleUitgave());
    }
}