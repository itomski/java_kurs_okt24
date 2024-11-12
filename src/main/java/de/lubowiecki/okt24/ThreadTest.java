package de.lubowiecki.okt24;

public class ThreadTest {

    public static void main(String[] args) {

        System.out.println("START <-- " + Thread.currentThread().getName());

        // void run();
        Runnable aufgabe = () -> print("A", 1000);

        new Thread(aufgabe).start();
        new Thread(() -> print("B", 1000)).start();
        new Thread(() -> print("C", 1000)).start();

        System.out.println("ENDE <-- " + Thread.currentThread().getName());

    }

    private static void print(String label, int num) {

        for (int i = 0; i < num; i++) {
            System.out.println(label + ": " + i + " <-- " + Thread.currentThread().getName());
        }
    }
}
