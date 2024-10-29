package de.lubowiecki.okt24.patterns.builder;

import java.time.LocalDate;

public class Kunde {

    private final String vorname;
    private final String nachname;
    private final LocalDate geburtsDatum;
    private final KundenArt art;

    public Kunde(String vorname, String nachname, LocalDate geburtsDatum, KundenArt art) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsDatum = geburtsDatum;
        this.art = art;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public LocalDate getGeburtsDatum() {
        return geburtsDatum;
    }

    public KundenArt getArt() {
        return art;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Kunde{");
        sb.append("vorname='").append(vorname).append('\'');
        sb.append(", nachname='").append(nachname).append('\'');
        sb.append(", geburtsDatum=").append(geburtsDatum);
        sb.append(", art=").append(art);
        sb.append('}');
        return sb.toString();
    }
}
