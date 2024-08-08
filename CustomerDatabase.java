package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class CustomerDatabase {
    private Map<String, Customer> customers = new HashMap<>();

    public void addCustomer(String email, Customer customer) {
        customers.put(email, customer);
    }

    public Customer getCustomer(String email) {
        return customers.get(email);
    }

    public static class Customer {
        public String name;
        public String email;
        public List<Order> orders;

        public Customer(String name, String email) {
            this.name = name;
            this.email = email;
            this.orders = new ArrayList<>();
        }

        public void addOrder(Order order) {
            orders.add(order);
        }
    }

    public static class Order {
        public int orderId;
        public String productName;
        public int quantity;

        public Order(int orderId, String productName, int quantity) {
            this.orderId = orderId;
            this.productName = productName;
            this.quantity = quantity;
        }
    }

    public static void main(String[] args) {
        CustomerDatabase database = new CustomerDatabase();

        Customer customer1 = new Customer("John Doe", "john.doe@example.com");
        customer1.addOrder(new Order(1, "Product A", 2));
        customer1.addOrder(new Order(2, "Product B", 3));

        database.addCustomer(customer1.email, customer1);

        Customer retrievedCustomer = database.getCustomer("john.doe@example.com");
        System.out.println("Retrieved Customer: " + retrievedCustomer.name);
        for (Order order : retrievedCustomer.orders) {
            System.out.println("Order: " + order.orderId + " - " + order.productName + " x " + order.quantity);
        }
    }
}