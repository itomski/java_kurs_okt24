package uebung4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Produktverwaltung {

    private List<Produkt> produkte = new ArrayList<>();

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new Produktverwaltung().start();
    }

    private void start() {

        while(true) {

            System.out.print("Eingabe: ");
            String eingabe = scanner.next();

            if(eingabe.equals("list")) {
                printProducts();
            }
            else if (eingabe.equals("neu")) {
                // TODO: Produkt erzeugen und in der Liste abspeichern
                System.out.println("...");
            }
            else if (eingabe.equals("exit")) {
                break;
            }
            else {
                System.out.println("Falsche Eingabe");
            }
        }

        System.out.println("Programm wurde beendet.");
    }

    private void printProducts() {
        for (Produkt p : produkte) {
            System.out.println(p);
        }
    }
}
