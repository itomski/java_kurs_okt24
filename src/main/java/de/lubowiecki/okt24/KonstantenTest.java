package de.lubowiecki.okt24;

import java.time.LocalTime;

public class KonstantenTest {

    private static final int I = 300;
    private static final int I2;

    private final int J = 500;
    private final int J2;
    private final int J3;

    static {
        if(LocalTime.now().isAfter(LocalTime.NOON))
            I2 = 400;
        else
            I2 = 800;
    }

    {
        J2 = 600;
    }

    public KonstantenTest() {
        J3 = 700;
    }

    public static void main(String[] args) {

        final int K = 100; // Compiletime-Konstante

        final int L;
        L = 200; // Runtime-Konstante

        System.out.println(K);
        System.out.println(L);

        System.out.println();

        System.out.println(I);
        System.out.println(I2);

        System.out.println();

        KonstantenTest kt = new KonstantenTest();
        System.out.println(kt.J);
        System.out.println(kt.J2);
        System.out.println(kt.J3);
    }
}
