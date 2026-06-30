package se.lexicon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OrderTest {

    @Test
    void addProduct() {
        Order test = new Order(new Customer("John Doe", "john.doe@nobody.net"));
        test.addProduct(new Product("Coffee", 25.0));
        Assertions.assertEquals(25.0, test.calculateTotal() );
    }

    @Test
    void removeProduct() {
        Order test = new Order(new Customer("John Doe", "john.doe@nobody.net"));
        Product coffee = new Product("Coffee", 25.0);
        test.addProduct(coffee);
        test.removeProduct(coffee);
        Assertions.assertEquals(0.0, test.calculateTotal() );
    }

    @Test
    void calculateTotal() {
        Order test = new Order(new Customer("John Doe", "john.doe@nobody.net"));
        Product coffee = new Product("Coffee", 25.0);
        test.addProduct(coffee);
        test.addProduct(coffee);
        Assertions.assertEquals(50, test.calculateTotal());
    }
}