package database;

import java.sql.*;
import java.util.List;

public class App {

    public static void main(String[] args) {
        new App().start();
    }

    private void start() {
        try {
            final ProductRepository repo = new ProductRepository();

            //repo.save(repo.create());
            showProducts(repo.findAll());
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
