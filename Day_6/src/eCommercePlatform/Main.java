
package eCommercePlatform;
import java.util.ArrayList;

public class Main {
    public static void calculateAndPrintFinalPrice(ArrayList<Product> products) {
        for (Product product : products) {
            double discount = product.calculateDiscount();
            double tax = product instanceof Taxable ? ((Taxable) product).calculateTax() : 0;
            double finalPrice = product.getPrice() + tax - discount;

            System.out.println("Product: " + product.getName());
            System.out.println("Price: " + product.getPrice());
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
            if (product instanceof Taxable) {
                System.out.println(((Taxable) product).getTaxDetails());
            }
            System.out.println("------------------------------------");
        }
    }

    public static void main(String[] args) {
        // Create a list of products
        ArrayList<Product> products = new ArrayList<>();

        // Add Electronics, Clothing, and Groceries
        Electronics laptop = new Electronics(1, "Laptop", 50000, 10);
        Clothing tshirt = new Clothing(2, "T-Shirt", 2000, 20);
        Groceries rice = new Groceries(3, "Rice", 5000, 10);

        products.add(laptop);
        products.add(tshirt);
        products.add(rice);

        // Calculate and print final price for each product
        calculateAndPrintFinalPrice(products);
    }
}
