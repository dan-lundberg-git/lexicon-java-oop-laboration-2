package se.lexicon;

public class OnlineShop {
    static void main() {
        try {
            // Creating two products
            Product coffee = new Product("Coffee", 25.0);
            Product sandwich = new Product("Sandwich", 65.0);

            // Creating a customer named Joe
            Customer joe = new Customer("Joe Smith", "joe.smith@test.com");

            // Create an order for Joe
            Order joesOrder = new Order(joe);
            joesOrder.addProduct(coffee);
            joesOrder.addProduct(sandwich);

            // Print the order summary for Joe
            joesOrder.printSummary();

            // Remove one order form the list
            joesOrder.removeProduct(coffee);

            // Print the order summary for Joe again
            joesOrder.printSummary();

            // Create another product
            Product iceCream = new Product("Ice cream", 35.0);

            // Apply a small discount on the Ice Cream, since it's summer... ;)
            iceCream.applyDiscount(10);

            // Add Ice Cream to Joe's order
            joesOrder.addProduct(iceCream);

            // Print the order summary for Joe again
            joesOrder.printSummary();
        } catch (IllegalArgumentException iae) {
            IO.println(iae.getMessage());
        } catch (Exception e) {
            IO.println("Something went wrong. See error message: " + e.getMessage());
        }
    }
}
