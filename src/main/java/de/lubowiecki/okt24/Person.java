package de.lubowiecki.okt24;

import java.io.Serializable;
import java.time.LocalDate;

public class Person implements Serializable {

    // gehört der Klasse
    private static int count;

    // gehören dem Objekt
    private int nr;

    private String vorname;

    private String nachname;

    private LocalDate geburtsDatum;

    private boolean raucher;

    public Person() {
        nr = ++count;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public LocalDate getGeburtsDatum() {
        return geburtsDatum;
    }

    public void setGeburtsDatum(LocalDate geburtsDatum) {
        this.geburtsDatum = geburtsDatum;
    }

    public boolean isRaucher() {
        return raucher;
    }

    public void setRaucher(boolean raucher) {
        this.raucher = raucher;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nr=" + nr +
                ", vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", geburtsDatum=" + geburtsDatum +
                ", raucher=" + raucher +
                '}';
    }
}
