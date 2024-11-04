package de.lubowiecki.okt24.fahrzeuge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FahrzeugRepository implements Repository<Fahrzeug> {

    private List<Fahrzeug> fahrzeuge = new ArrayList<>();

    @Override
    public void add(Fahrzeug fahrzeug) {
        fahrzeuge.add(fahrzeug);
    }

    @Override
    public List<Fahrzeug> getAll() {
        return Collections.unmodifiableList(fahrzeuge);
    }

    public Fahrzeug getByKennzeichen(String kennzeichen) {
        throw new UnsupportedOperationException();
    }

    public Fahrzeug getByMarke(String marke) {
        throw new UnsupportedOperationException();
    }

    public Fahrzeug getByModelle(String modell) {
        throw new UnsupportedOperationException();
    }
}
