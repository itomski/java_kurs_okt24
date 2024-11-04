package de.lubowiecki.okt24.fahrzeuge;

import java.util.List;

public class BenutzerRepository implements Repository<Benutzer> {
    @Override
    public void add(Benutzer benutzer) {

    }

    @Override
    public List<Benutzer> getAll() {
        return List.of();
    }

    public Fahrzeug getByVornamen(String vorname) {
        throw new UnsupportedOperationException();
    }

    public Fahrzeug getByNachname(String nachname) {
        throw new UnsupportedOperationException();
    }
}
