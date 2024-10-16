package de.lubowiecki.okt24;

public class MultiCatchTest {

    public static void main(String[] args) {

        try {
            int[] arr = new int[10];
            System.out.println(arr[10]);
        }
        catch(ArrayIndexOutOfBoundsException e) {

            System.out.println(e instanceof ArrayIndexOutOfBoundsException);
            System.out.println(e instanceof RuntimeException);
            System.out.println(e instanceof Exception);
            System.out.println(e instanceof Throwable);

            // Neues Objekt auf die e-Referenz legen
            e = new ArrayIndexOutOfBoundsException("...");
        }

        System.out.println();

        try {
            int[] arr = new int[10];
            System.out.println(arr[10]);
        }
        catch(ArrayIndexOutOfBoundsException | ArithmeticException e) {
            // e ist in einem Multicatch immer final
            // e = new ArrayIndexOutOfBoundsException("..."); // Compilererror
        }

    }

}
