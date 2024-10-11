package de.lubowiecki.okt24.patterns.composite;

public class Test {

    public static void main(String[] args) {

        Kreis k1 = new Kreis(5,7, 100);
        System.out.println(k1);
        System.out.println(k1.getX() + ", " + k1.getY());

        System.out.println();

        Rechteck r1 = new Rechteck(15,22, 100, 200);
        System.out.println(r1);
        System.out.println(r1.getX() + ", " + r1.getY());

        System.out.println();

        Quadrat q1 = new Quadrat(10,-20, 50);
        System.out.println(q1);
        System.out.println(q1.getX() + ", " + q1.getY());

        System.out.println();

        System.out.println(q1 instanceof Quadrat);
        System.out.println(q1 instanceof Rechteck);
        System.out.println(q1 instanceof AbstractGeoForm);
        System.out.println(q1 instanceof Bewegbar);
        System.out.println(q1 instanceof Object);

        System.out.println();

        k1.bewegeNach(10, 50);
        r1.bewegeNach(10, 50);
        q1.bewegeNach(10, 50);

        System.out.println(k1);
        System.out.println(r1);
        System.out.println(q1);

        Gruppe g1 = new Gruppe(k1, r1);
        g1.add(q1);

        Rechteck r2 = new Rechteck(1,5, 10, 20);
        Rechteck r3 = new Rechteck(2,5, 20, 20);
        Rechteck r4 = new Rechteck(3, 5, 30, 20);
        Gruppe g2 = new Gruppe(r2, r3, r4);
        g1.add(g2);

        System.out.println();

        System.out.println(g1);

        g1.bewegeNach(20, 20);

        System.out.println(g1);
    }
}
