package se.lexicon;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final Customer customer;
    private List<Product> products;

    public Order(Customer customer) {
        this.customer = customer;
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public double calculateTotal() {
        double sum = 0.0;
        for (Product product : products) {
            sum += product.getPrice();
        }
        return sum;
    }

    public void printSummary() {
        IO.println("Customer name: " + customer.getName());
        for (Product product : products) {
            IO.println("Product name: " + product.getName() + ", Product price: " + product.getPrice());
        }
        IO.println("Total cost: " + calculateTotal());
    }
}
