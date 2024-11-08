package de.lubowiecki.okt24;

import java.util.Random;

public class DiceCup {

    private final Random rand = new Random();

    private final int size;

    public DiceCup() {
        size = 6;
    }

    public DiceCup(int size) {
        this.size = size;
    }

    public int roll() {
        return rand.nextInt(size) + 1;
    }

    public int roll(int size) {
        if(size < 0 || size > 1000) throw new IllegalArgumentException();
        return rand.nextInt(size) + 1;
    }
}
