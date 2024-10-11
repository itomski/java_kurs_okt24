package de.lubowiecki.okt24.patterns.composite;

public class Quadrat extends Rechteck {

    public Quadrat() {
    }

    public Quadrat(int x, int y, int breite) {
        super(x, y, breite, breite);
    }

    @Override
    public String toString() {
        String objStr = super.toString();
        int start = objStr.indexOf("{");
        return getClass().getSimpleName() + objStr.substring(start);
    }
}
