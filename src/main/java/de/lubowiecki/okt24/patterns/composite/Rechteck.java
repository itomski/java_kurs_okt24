package de.lubowiecki.okt24.patterns.composite;

public class Rechteck extends AbstractGeoForm implements Bewegbar {

    private int laenge;

    private int breite;

    public Rechteck() {
    }

    public Rechteck(int x, int y, int laenge, int breite) {
        super(x, y);
        this.laenge = laenge;
        this.breite = breite;
    }

    public int getLaenge() {
        return laenge;
    }

    public void setLaenge(int laenge) {
        this.laenge = laenge;
    }

    public int getBreite() {
        return breite;
    }

    public void setBreite(int breite) {
        this.breite = breite;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rechteck{");
        sb.append("x=").append(getX());
        sb.append(", y=").append(getY());
        sb.append(", laenge=").append(laenge);
        sb.append(", breite=").append(breite);
        sb.append('}');
        return sb.toString();
    }
}
