package de.lubowiecki.okt24;

public class InnerOuterClassTest {

    public static void main(String[] args) {

        OuterClass oc = new OuterClass();

        // Braucht eine Instanz der Outer
        OuterClass.InnerClass ic = oc.new InnerClass();
        ic = new OuterClass().new InnerClass();

        // Kann ohne eine Instanz der Outer verwendet werden
        OuterClass.StaticInnerClass sic = new OuterClass.StaticInnerClass();

        System.out.println(sic instanceof OuterClass.StaticInnerClass);

    }
}

class OuterClass {

    private int i;
    private static int j;

    // Instanz-Inner
    class InnerClass {

        // Kann nur statisches und instanz Inventar (auch privates) von Outer verwenden
        public void showI() {
            System.out.println(i);
        }
    }

    // Static-Inner
    static class StaticInnerClass {

        // Kann nur statisches Inventar (auch privates) von Outer verwenden
        public void showI() {
            System.out.println(j);
        }
    }
}