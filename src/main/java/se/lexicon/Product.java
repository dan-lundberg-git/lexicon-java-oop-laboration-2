package se.lexicon;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (Double.isNaN(price) || price < 0.0) {
            throw new IllegalArgumentException("Price must be a positive number");
        }
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void applyDiscount(double percent) {
        if (percent > 80.0) {
            throw new IllegalArgumentException("Discount not allowed to be larger than 80%");
        }
        price = (price * (100 - percent)) / 100;
    }

    public void printInfo() {
        IO.println("Product name: " + name + ", Product price: " + price);
    }
}
