package de.lubowiecki.okt24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RechnerTest {

    @Test
    void exec5add10() {
        Rechner r = new Rechner();
        double erwartet = 15;
        assertEquals(erwartet, r.add(5,10));
    }

    @Test
    void exec3add4() {
        Rechner r = new Rechner();
        double erwartet = 7;
        assertEquals(erwartet, r.add(3,4));
    }

    @Test
    void exec100add200() {
        Rechner r = new Rechner();
        double erwartet = 300;
        assertEquals(erwartet, r.add(100,200));
    }
}