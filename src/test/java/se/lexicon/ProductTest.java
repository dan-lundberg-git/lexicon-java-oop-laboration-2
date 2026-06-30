package se.lexicon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProductTest {

    @Test
    void getName() {
        Product test = new Product("Test", 25.0);
        Assertions.assertEquals("Test", test.getName());
    }

    @Test
    void getPrice() {
        Product test = new Product("Test", 25.0);
        Assertions.assertEquals(25.0, test.getPrice());
    }

    @Test
    void applyDiscount() {
        Product test = new Product("Test", 25.0);
        test.applyDiscount(50);
        Assertions.assertEquals(12.5, test.getPrice());
    }
}