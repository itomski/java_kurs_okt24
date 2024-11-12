package de.lubowiecki.okt24;

import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class GameLoopTest {

    public static void main(String[] args) {

        //ExecutorService service = Executors.newSingleThreadExecutor(); // 1 extra Thread
        //ExecutorService service = Executors.newFixedThreadPool(10); // 10 etra Threads

        // Pool für zeitgesteuerte Ausführung
        ScheduledExecutorService service = Executors.newScheduledThreadPool(1);

        Scanner scanner = new Scanner(System.in);

        app: while(true) {

            System.out.print("Eingabe: ");
            switch(scanner.nextLine().trim().toLowerCase()) {

                case "aufgabe":
                    System.out.print("Label: ");
                    String label = scanner.nextLine();
                    System.out.print("Anzahl Ausführunen: ");
                    int num = scanner.nextInt();
                    scanner.nextLine(); // fix

                    // Einmalige Ausführung
                    //service.submit(() -> print(label, num));

                    // Periodische Ausführung
                    service.scheduleAtFixedRate(() -> print(label, num), 1000, 1000, TimeUnit.MILLISECONDS);
                    break;

                case "exit": break app;
            }
        }

        System.out.println("Programm wird beendet");
        service.shutdown();
    }

    private static void print(String label, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(label + ": " + i + " <-- " + Thread.currentThread().getName());
        }
    }
}
