package de.lubowiecki.okt24;

public interface MainInterface {

    // Main muss auf der Top-Level-Ebene liegen
    public static void main(String[] args) {
        //System.out.println("MAIN INTERFACE!");

        X1 x1 = new X1();
        X2 x2 = new X2();
        X3 x3 = new X3();

        // x1 = new X3();
        System.out.println();
        System.out.println(x1.i);
        x1.print();

        System.out.println();
        System.out.println(x2.i);
        x2.print();

        System.out.println();
        System.out.println(x3.i);
        x3.print();

    }

    public interface SubInterface {

        public static void main(String[] args) { // Wird nicht verwendet!
            System.out.println("SUB INTERFACE!");
        }
    }
}

class X1 {

    int i = 10;

    public void print() {
        System.out.println(getClass().getSimpleName() + ": " + i);
    }
}

class X2 extends X1 {

    int i = 20;
}

class X3 extends X1 {

    int i = 30;

    public void print() {
        System.out.println(getClass().getSimpleName() + ": " + i);
    }
}