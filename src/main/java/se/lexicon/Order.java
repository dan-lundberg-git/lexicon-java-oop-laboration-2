package se.lexicon;

import java.util.List;

public class Order {
    private Customer customer;
    private List<Product> products;

    public Order(Customer customer) {
        this.customer = customer;
    }

    public void addProduct(Product product) {
    }

    public void removeProduct(Product product) {
    }

    public double calculateTotal() {
        return 0d;
    }

    public void printSummary() {
    }
}
