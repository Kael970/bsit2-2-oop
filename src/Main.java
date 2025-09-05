public class Main {
    public static void main(String[] args) {
        System.out.println("=== Food Ordering System ===\n");

        System.out.println("Creating orders and adding items...");

        Order order1 = new Order("Alice Johnson");
        Order order2 = new Order("Bob Smith");
        Order order3 = new Order("Charlie Brown");


        try {
            order1.addItem("Pizza", 12.99);
            System.out.println("Item 'Pizza' added successfully");
            order1.addItem("Pasta", 9.50);
            order1.addItem("Salad", 2.25);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }


        try {
            order2.addMultipleItems(new String[]{"Burger", "Fries"}, 8.50, 3.25);
            System.out.println("Items added: Burger, Fries");
            order2.addMultipleItems(new String[]{"Soda", "Salad", "Dessert"}, 1.99, 4.25, 14.46);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }


        try {
            order3.addItem("Ice Cream", -5.00);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            order3.addItem("", 2.50);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            order3.addMultipleItems(new String[]{"Sandwich", "Juice"}, 6.75);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        order3.addMultipleItems(new String[]{"Steak", "Wine"}, 10.00, 5.50);


        System.out.println("\nOrder Results:");
        System.out.println(order1.displayOrder());
        System.out.println(order2.displayOrder());
        System.out.println(order3.displayOrder());

        System.out.println("\nTotal orders created: " + Order.getTotalOrders());


        Order[] allOrders = {order1, order2, order3};
        Order largest = allOrders[0];
        for (Order o : allOrders) {
            if (o.getTotalAmount() > largest.getTotalAmount()) {
                largest = o;
            }
        }
        System.out.println("Largest order: " + largest.getCustomerName() +
                " ($" + String.format("%.2f", largest.getTotalAmount()) + ")");
    }
}
