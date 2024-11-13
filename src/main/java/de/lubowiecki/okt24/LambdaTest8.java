package de.lubowiecki.okt24;

import java.util.Scanner;

public class LambdaTest8 {

    public static void main(String[] args) {

        //DoubleMathOperation add = (a, b) -> a + b;
        DoubleMathOperation add = Double::sum; // Double.sum(a, b)
        DoubleMathOperation multi = (a, b) -> a * b;
        DoubleMathOperation sub = (a, b) -> a - b;
        DoubleMathOperation div = (a, b) -> a / b;
        DoubleMathOperation mod = (a, b) -> a % b;

//        System.out.println(add.exec(10, 20));
//        System.out.println(multi.exec(10, 20));
//        System.out.println(sub.exec(10, 20));
//        System.out.println(div.exec(10, 20));

        Scanner scanner = new Scanner(System.in);

        app: while(true) {
            try {
                System.out.print("Operation: ");
                String opStr = scanner.next();

                if(opStr.equalsIgnoreCase("exit")) break app;

//                DoubleMathOperation op;

//                switch (opStr) { // -> macht automatisch ein break nach jedem case
//                    case "+" -> op = add;
//                    case "-" -> op = sub;
//                    case "*" -> op = multi;
//                    case "/" -> op = div;
//                    case "%" -> op = mod;
//                    default -> throw new UnsupportedOperationException();
//                }

                System.out.print("a: ");
                int a = scanner.nextInt();
                System.out.print("b: ");
                int b = scanner.nextInt();

                // System.out.println("Erg: " + op.exec(a, b));

                double erg = switch (opStr) { // -> macht automatisch ein break nach jedem case
                    case "+" -> add.exec(a, b);
                    case "-" -> sub.exec(a, b);
                    case "*" -> multi.exec(a, b);
                    case "/" -> div.exec(a, b);
                    case "%" -> mod.exec(a, b);
                    default -> throw new UnsupportedOperationException();
                };

                System.out.println("Erg: " + erg);
            }
            catch (UnsupportedOperationException ex) {
                System.out.println("Ungültige Operation.");
            }
        }
    }
}

@FunctionalInterface
interface DoubleMathOperation {

    double exec(double a, double b);

}
