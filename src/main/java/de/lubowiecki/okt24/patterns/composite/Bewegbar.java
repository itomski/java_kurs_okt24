package de.lubowiecki.okt24.patterns.composite;

public abstract interface Bewegbar {

    // Alle Eigenschaften sind automatisch public static final

    // Das Inventar in einem Interface ist automatisch public
    void bewegeNach(int x, int y);

    /*
    // default Methoden im Interface dürfen die Methoden von Object nicht überschreiben!!!!!!!
    @Override
    default int hashCode() {
        return 123;
    }
    */
}
