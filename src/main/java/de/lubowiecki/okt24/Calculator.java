package de.lubowiecki.okt24;

public abstract class Calculator {

    public abstract void calculate();

    public static void main(String[] args) {

        // Calculator x = null;
        // Calculator x = new Calculator(); // Error: Calculator ist abstrakt
        Calculator x = new Calculator() {
            @Override
            public void calculate() {
                System.out.println("Anonyme class");
            }
        };

        x = new ConcretCalculator();
    }
}

class ConcretCalculator extends Calculator {

    @Override
    public void calculate() {
        System.out.println("Concret class");
    }
}
