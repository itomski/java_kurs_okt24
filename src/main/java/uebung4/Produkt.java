package uebung4;

import java.io.Serializable;
import java.time.LocalDate;

public class Produkt implements Serializable {

    private String name;
    private String beschreibung;
    private int menge;
    private LocalDate imBestandSeit;
    private double preis;

    public Produkt() {
        this.imBestandSeit = LocalDate.now();
    }

    public Produkt(String name, String beschreibung, int menge, double preis) {
        this();
        this.name = name;
        this.beschreibung = beschreibung;
        this.menge = menge;
        this.preis = preis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public int getMenge() {
        return menge;
    }

    public void setMenge(int menge) {
        this.menge = menge;
    }

    public LocalDate getImBestandSeit() {
        return imBestandSeit;
    }

    public void setImBestandSeit(LocalDate imBestandSeit) {
        this.imBestandSeit = imBestandSeit;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }
}
