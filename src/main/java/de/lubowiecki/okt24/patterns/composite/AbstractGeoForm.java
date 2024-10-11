package de.lubowiecki.okt24.patterns.composite;

public class AbstractGeoForm implements Bewegbar {

    private int x;

    private int y;

    public AbstractGeoForm() {
    }

    public AbstractGeoForm(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // final = Methode kann in den Kindklassen nicht überschrieben werden
    @Override
    public final void bewegeNach(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
