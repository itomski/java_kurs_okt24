package de.lubowiecki.okt24.fahrzeuge;

import java.util.List;

public interface Repository<T> {


    void add(T t);

    List<T> getAll();

}
