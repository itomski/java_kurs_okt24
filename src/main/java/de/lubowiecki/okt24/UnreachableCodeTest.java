package de.lubowiecki.okt24;

public class UnreachableCodeTest {

    public static void main(String[] args) {

        final boolean show = true; // Compiletime

        try {
            System.out.println(check(25));
            System.out.println(check(15));
            System.out.println(check(-20));
        }
        catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(sum(new int[]{5,7,8,99,18}));
        System.out.println(sum(5,7,8,99,18, 16, 1, -15));

        /*
        while(show) {
            System.out.println("Das ist das Haus von Nikigraus");
        }
        */

        // System.out.println("Ende"); // CompilerError: Nicht erreichbar

        //StringBuilder sb = new StringBuilder();
        // sb.appand(100); // append wird mehrmals überladen
    }

    private static void machWas() {

        System.out.println("Zeile 1");
        System.out.println("Zeile 2");
        return;
        // System.out.println("Zeile 3"); // CompilerError: Nicht erreichbar
    }

    private static boolean check(int alter) {

        if(alter >= 18) return true;

        if(alter > 0 && alter < 18) return false;

        throw new IllegalArgumentException("Das Alter ist ungültig!");
    }

    // VarArgs
    private static int sum(int... zahlen) {
        var sum = 0;
        for(int z : zahlen) {
            sum += z;
        }
        return sum;
    }
}
