package de.lubowiecki.okt24;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DiceCupTest {

    private DiceCup cup;

    @BeforeEach
    void init() { // Vor jedem Test
        //System.out.println("Start");
        cup = new DiceCup();
    }

    @AfterEach
    void reset() { // Nach jedem Test
        //System.out.println("Fertig");
    }

    //@Test
    @DisplayName("Roll the D6 dice 10 times")
    @RepeatedTest(value = 10, name = "Roll the D6 dice: {currentRepetition} of {totalRepetitions}")
    void checkRoll1() {
        // System.out.println("Methode");
        int erg = cup.roll();
        assertTrue(erg > 0 && erg <= 6);
    }

    /*
    @Test
    @DisplayName("Roll the D6 dice")
    void checkRoll2() {
        // System.out.println("Methode");
        int erg = cup.roll();
        assertTrue(erg > 0 && erg <= 6);
    }

    @Test
    @DisplayName("Roll the D6 dice")
    void checkRoll3() {
        // System.out.println("Methode");
        int erg = cup.roll();
        assertTrue(erg > 0 && erg <= 6);
    }
    */

    @Test
    @DisplayName("Roll the D6 dice: negative size")
    void checkRoll4() {
        assertThrows(IllegalArgumentException.class, () -> cup.roll(-10));
    }

    @Test
    @DisplayName("Roll the D6 dice: illegal size")
    void checkRoll5() {
        assertThrows(IllegalArgumentException.class, () -> cup.roll(1250));
    }
}