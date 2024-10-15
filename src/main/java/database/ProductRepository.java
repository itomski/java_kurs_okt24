package database;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    private static final String TABLE = "products";

    // CRUD : Create, Read, Update, Delete

    public ProductRepository() throws SQLException {
        createTable();
    }

    public List<Product> findAll() throws SQLException {

        final String SQL = "SELECT * FROM " + TABLE;

        try(Connection connection = DbUtils.getConnection();
            Statement stmt = connection.createStatement()) {

            ResultSet results = stmt.executeQuery(SQL);
            List<Product> produkte = new ArrayList<>();
            while(results.next()) {
                produkte.add(create(results));
            }
            return produkte;
        }
    }

    public Product findAById(int id) throws SQLException {

        final String SQL = "SELECT * FROM " + TABLE + " WHERE id = " + id;

        try(Connection connection = DbUtils.getConnection();
            Statement stmt = connection.createStatement()) {

            ResultSet results = stmt.executeQuery(SQL);
            if(results.next()) {
                return create(results);
            }
            return null;
        }
    }

    public void save(Product product) throws SQLException {

        if(product.getId() <= 0) {
            insert(product);
        }
        else {
            update(product);
        }
    }

    private void update(Product product) throws SQLException {

        final String SQL = "UPDATE " + TABLE + " SET name = ?, " +
                                "beschreibung = ?, " +
                                "im_bestand_seit = ?, " +
                                "menge = ?, " +
                                "preis = ? " +
                                "WHERE id = ?";

        try(Connection connection = DbUtils.getConnection();
            PreparedStatement stmt = connection.prepareStatement(SQL)) {

            stmt.setString(1, product.getName());
            stmt.setString(2, product.getDescription());
            stmt.setString(3, product.getCreatedAt().toString());
            stmt.setInt(4, product.getAmount());
            stmt.setDouble(5, product.getPrice());
            stmt.setInt(6, product.getId());
            stmt.execute();
        }
    }

    public Product create(String name, String beschreibung, LocalDate imBestandSeit, int menge, double preis) {
        Product p = new Product();
        p.setName(name);
        p.setDescription(beschreibung);
        p.setCreatedAt(imBestandSeit);
        p.setAmount(menge);
        p.setPrice(preis);
        return p;
    }

    public Product create(ResultSet result) throws SQLException {
        Product p = new Product();
        p.setId(result.getInt("id"));
        p.setName(result.getString("name"));
        p.setDescription(result.getString("beschreibung"));
        p.setCreatedAt(LocalDate.parse(result.getString("im_bestand_seit")));
        p.setAmount(result.getInt("menge"));
        p.setPrice(result.getDouble("preis"));
        return p;
    }

    private void insert(Product product) throws SQLException {

        final String SQL = "INSERT INTO " + TABLE + " (id, name, beschreibung, im_bestand_seit, menge, preis) " +
                "VALUES(NULL, ?, ?, ?, ?, ?)";

        // PreparedStatements schützen vor SqlInjection
        try(Connection connection = DbUtils.getConnection();
            PreparedStatement stmt = connection.prepareStatement(SQL)) {
            stmt.setString(1, product.getName());
            stmt.setString(2, product.getDescription());
            stmt.setString(3, product.getCreatedAt().toString());
            stmt.setInt(4, product.getAmount());
            stmt.setDouble(5, product.getPrice());
            stmt.execute();
        }
    }

    public void delete(Product product) throws SQLException {
        deleteById(product.getId());
    }

    public void deleteById(int id) throws SQLException {

        final String SQL = "DELETE FROM " + TABLE + " WHERE id = " + id;

        try(Connection connection = DbUtils.getConnection();
            Statement stmt = connection.createStatement()) {
            stmt.executeUpdate(SQL);
        }
    }

    public void createTable() throws SQLException {

        final String SQL = "CREATE TABLE IF NOT EXISTS " + TABLE + " (" +
                "id INTEGER," +
                "name TEXT NOT NULL," +
                "beschreibung TEXT NOT NULL," +
                "im_bestand_seit TEXT," +
                "menge INTEGER," +
                "preis REAL," +
                "PRIMARY KEY (id AUTOINCREMENT))";

        try(Connection connection = DbUtils.getConnection();
            Statement stmt = connection.createStatement()) {
            stmt.execute(SQL);
        }
    }
}
