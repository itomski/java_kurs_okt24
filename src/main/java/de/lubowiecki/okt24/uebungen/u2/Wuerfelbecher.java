package de.lubowiecki.okt24.uebungen.u2;

import java.util.Random;

public class Wuerfelbecher {

    private final int AUGEN;

    private final Random zufallsGenerator = new Random();

    public Wuerfelbecher() {
        AUGEN = 6;
    }

    public Wuerfelbecher(Wuerfel wuerfel) {
        AUGEN = wuerfel.getAugen();
    }

    public int wuerfeln() {
        return zufallsGenerator.nextInt(AUGEN) + 1;
    }

    public int[] wuerfeln(int anzahl) {
        // throw new UnsupportedOperationException("Methode muss implementiert werden.");

        int[] erg = new int[anzahl];
        for (int i = 0; i < erg.length; i++) {
            erg[i] = wuerfeln();
        }
        return erg;
    }

    public void stats(int[] werte) {
        int[] stats = new int[AUGEN];
        for(int wert : werte) {
            stats[wert-1]++;
        }
        printStats(stats);
    }

    private void printStats(int[] stats) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stats.length; i++) {
            sb.append(stats[i]).append(" x ").append(i + 1).append("\n");
        }
        System.out.println(sb);
    }
}
