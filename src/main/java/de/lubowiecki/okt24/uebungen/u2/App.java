package de.lubowiecki.okt24.uebungen.u2;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        Wuerfelbecher becher = new Wuerfelbecher(Wuerfel.W10);

        System.out.println(becher.wuerfeln());
        System.out.println(becher.wuerfeln());
        System.out.println(becher.wuerfeln());

        System.out.println();

        System.out.println(Arrays.toString(becher.wuerfeln(5)));
        System.out.println(Arrays.toString(becher.wuerfeln(3)));
        System.out.println(Arrays.toString(becher.wuerfeln(10)));

        System.out.println(Wuerfel.W6.getAugen());
        System.out.println(Wuerfel.W100.getAugen());
        System.out.println(Wuerfel.W20.getAugen());
        // System.out.println(Wuerfel.W3); // Error. Option gibt es nicht

        System.out.println();

        int[] wuerfe = becher.wuerfeln(10);
        System.out.println(Arrays.toString(wuerfe));
        becher.stats(wuerfe);

    }
}
