package uebung4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Produktverwaltung {

    private List<Produkt> produkte;

    private Scanner scanner = new Scanner(System.in);

    private static final String ROW_TPL = "| %-20s | %-25s | %-12s | %6d | %8.2f | \n";

    private static final String SER_FILE = System.getProperty("user.home") + "/data.ser";

    public static void main(String[] args) {
        new Produktverwaltung().start();
    }

    private void start() {

        readFromFile(); // Altdaten einlesen

        while(true) {

            System.out.print("\nEingabe: ");
            String eingabe = scanner.next();

            if(eingabe.equals("list")) {
                printProducts();
            }
            else if (eingabe.equals("neu")) {
                createProduct();
                saveToFile();
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
        if(produkte.size() == 0) {
            System.out.println("Noch keine Produkte vorhanden.");
            return;
        }
        for (Produkt p : produkte) {
            System.out.printf(ROW_TPL,
                    p.getName(),
                    p.getBeschreibung(),
                    p.getImBestandSeit(),
                    p.getMenge(),
                    p.getPreis());
        }
    }

    private void createProduct() {
        Produkt p = new Produkt();

        scanner.nextLine(); // fix

        System.out.print("Name: ");
        // String name = scanner.nextLine();
        // p.setName(name);
        p.setName(scanner.nextLine());

        System.out.print("Beschreibung: ");
        p.setBeschreibung(scanner.nextLine());

        System.out.print("Menge: ");
        p.setMenge(scanner.nextInt());

        System.out.print("Preis: ");
        p.setPreis(scanner.nextDouble());

        produkte.add(p);
        System.out.println("Produkt wurde gespeichert.");
    }

    private void saveToFile() {

        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(SER_FILE))) {
            // Serailisierung
            out.writeObject(produkte); // ArrayList wird gespeichert
        }
        catch(IOException e) {
            System.out.println("Probleme beim Schreiben in die Datei");
        }
    }

    private void readFromFile() {
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(SER_FILE))) {
            // Deserailisierung
            produkte = (List<Produkt>) in.readObject();
        }
        catch(Exception e) {
            System.out.println("Altdaten konnten nicht eingelesen werden.");
            produkte = new ArrayList<>();
        }
    }
}
