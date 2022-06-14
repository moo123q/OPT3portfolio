package com.company;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


class SpaardoelTest {

    @Test
    void berekenSpaarDuur() {
        Spaardoel spaardoel = new Spaardoel();
        spaardoel.setSpaarBedrag(4500);
        spaardoel.setGekozenBedrag(1499);
        Assert.assertEquals(4, spaardoel.berekenSpaarDuur());
    }

    @Test
    void berekenSpaarDuur2() {
        Spaardoel spaardoel = new Spaardoel();
        spaardoel.setSpaarBedrag(4500);
        spaardoel.setGekozenBedrag(1500);
        Assert.assertEquals(3, spaardoel.berekenSpaarDuur());
    }
}