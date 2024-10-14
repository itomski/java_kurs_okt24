package de.lubowiecki.okt24.uebungen.u2;

public enum Wuerfel {

    W6, W10, W20, W100;

    public int getAugen() {
        String str = this.toString().replace("W", "");
        return Integer.parseInt(str);
    }
}
