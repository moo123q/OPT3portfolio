package com.company;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpaardoelTest {

    @Test
    void berekenSpaarDuur() {
        Spaardoel spaardoel = new Spaardoel();
        spaardoel.setSpaarBedrag(4500);
        spaardoel.setGekozenBedrag(1499);
        Assert.assertEquals(4, spaardoel.berekenSpaarDuur());
    }
}