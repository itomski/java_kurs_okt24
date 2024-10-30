package de.lubowiecki.okt24;

/**
 * Eine kleine Hilfsklasse
 * @author Tomasz
 * @since 1.8
 */
public class Helper {

    private Helper() {
    }

    /**
     * Es wird etwas gemacht
     * @param i Überflüssiger Parameter
     * @return immer eine 0
     */
    public static int doSomething(int i) {

        int j = 0;

        // System.out.println(if(j >= 0) "A"; else "B"); // Error
        System.out.println((j >= 0) ? "A" : "B");


        return 0;
    }
}
