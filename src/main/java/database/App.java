package database;

import java.sql.*;
import java.time.LocalDate;
import java.util.List;

public class App {

    public static void main(String[] args) {
        new App().start();
    }

    private void start() {
        try {
            final ProductRepository repo = new ProductRepository();

            // READ
            showProducts(repo.findAll());
            //Product p = repo.findAById(6);
            //System.out.println(p);


            // CREATE
            //Product p = repo.create("Milch", "1,5% Fett", LocalDate.now().minusDays(1), 100, 1.29);
            //repo.save(p);

            // DELETE
            //repo.deleteById(9);
            //repo.delete(p);

            // UPDATE
            Product p = repo.findAById(10);
            p.setPrice(1.59);
            p.setAmount(500);
            p.setName("H-Milch");
            repo.save(p);

        }
        catch (SQLException e) {
            e.printStackTrace();
            //System.out.println("Problem mit der Verbindung zu der Datenbank.");
        }
    }

    private void showProducts(List<Product> list) {
        for(Product p : list) {
            // TODO: Ausgabe formatieren
            System.out.println(p);
        }
    }
}
