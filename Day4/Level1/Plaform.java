import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    private int orderId;
    private Customer customer;
    private List<Product> products;

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
        customer.addOrder(this); // Establish relationship with customer
    }

    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void listProducts() {
        System.out.println("Order " + orderId + " contains the following products:");
        for (Product product : products) {
            System.out.println("- " + product.getName() + " ($" + product.getPrice() + ")");
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}

class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addOrder(Order order) {
        if (!orders.contains(order)) {
            orders.add(order);
        }
    }

    public void listOrders() {
        System.out.println(name + "'s orders:");
        for (Order order : orders) {
            System.out.println("- Order ID: " + order.getOrderId() + ", Total: $" + order.calculateTotal());
        }
    }
}

public class Plaform {
    public static void main(String[] args) {
        // Create customers
        Customer customer1 = new Customer("Sakshi");
        Customer customer2 = new Customer("Sahil");

        // Create products
        Product product1 = new Product("Laptop", 1200.00);
        Product product2 = new Product("Mouse", 25.00);
        Product product3 = new Product("Keyboard", 45.00);
        Product product4 = new Product("Monitor", 300.00);

        // Create orders
        Order order1 = new Order(1, customer1);
        Order order2 = new Order(2, customer2);

        // Add products to orders
        order1.addProduct(product1);
        order1.addProduct(product2);

        order2.addProduct(product3);
        order2.addProduct(product4);

        // Display orders and products
        customer1.listOrders();
        customer2.listOrders();

        order1.listProducts();
        order2.listProducts();
    }
}

