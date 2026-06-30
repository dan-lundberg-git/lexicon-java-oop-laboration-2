package se.lexicon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CustomerTest {

    @Test
    void getName() {
        Customer test = new Customer("John Doe", "john.doe@nobody.net");
        Assertions.assertEquals("John Doe", test.getName());
    }

    @Test
    void getEmail() {
        Customer test = new Customer("John Doe", "john.doe@nobody.net");
        Assertions.assertEquals("john.doe@nobody.net", test.getEmail());
    }
}