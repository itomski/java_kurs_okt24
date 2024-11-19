package de.lubowiecki.okt24;

public class MainTest {

    static {
        System.out.println("Bla bla bla");
        //System.exit(0);
    }

    public static final void main(String[] args) {
        System.out.println("Main...");

        Laptop laptop = new Laptop();
        laptop.memory = "1GB";
        repair(laptop);
        System.out.println(laptop.memory);

        System.gc();

        //System.out.println();
        //System.out.print();

        StringBuilder sb = new StringBuilder("ABC");
        sb.insert(3, "D");
        System.out.println(sb);
        //sb.insert(6, "E");
    }

    public static void repair(final Laptop laptop) {
        // laptop = new Laptop();
        laptop.memory = "2GB";
    }

}

class Laptop {

    public String memory;

}
