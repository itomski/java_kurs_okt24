package database;

import java.time.LocalDate;

public class Product {

    private int id;
    private String name;
    private String description;
    private LocalDate createdAt;
    private int amount;
    private double price;

    public Product() {
    }

    public Product(String name, String description, LocalDate createdAt, int amount, double price) {
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.amount = amount;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", createdAt=").append(createdAt);
        sb.append(", amount=").append(amount);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
