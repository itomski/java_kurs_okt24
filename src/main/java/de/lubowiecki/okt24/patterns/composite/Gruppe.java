package de.lubowiecki.okt24.patterns.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Gruppe implements Bewegbar {

    private List<Bewegbar> elemente;

    public Gruppe() {
        elemente = new ArrayList<>();
    }

    public Gruppe(Bewegbar... elemente) {
        this.elemente = new ArrayList<>(Arrays.asList(elemente));
    }

    public void add(Bewegbar b) {
        elemente.add(b);
    }

    public void add(Bewegbar... elemente) {
        this.elemente.addAll(Arrays.asList(elemente));
    }

    @Override
    public void bewegeNach(int x, int y) {
        for(Bewegbar b : elemente) {
            b.bewegeNach(x, y);
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Gruppe{");
        sb.append("elemente=").append(elemente);
        sb.append('}');
        return sb.toString();
    }
}
