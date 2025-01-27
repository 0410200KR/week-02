package onlinefood;

public class Main {
    public static void processOrder(FoodItem item) {
        item.getItemDetails();
        System.out.println("Total Price: " + item.calculateTotalPrice());
    }

    public static void main(String[] args) {
        FoodItem vegItem = new VegItem("Paneer Tikka", 200, 2);
        FoodItem nonVegItem = new NonVegItem("Chicken Biryani", 300, 1, 50);

        // Process order for Veg Item
        processOrder(vegItem);
        if (vegItem instanceof Discountable) {
            Discountable discountable = (Discountable) vegItem;
            discountable.applyDiscount(10); // Applying 10% discount
            System.out.println(discountable.getDiscountDetails());
        }

        System.out.println();

        // Process order for Non-Veg Item
        processOrder(nonVegItem);
        if (nonVegItem instanceof Discountable) {
            Discountable discountable = (Discountable) nonVegItem;
            discountable.applyDiscount(15); // Applying 15% discount
            System.out.println(discountable.getDiscountDetails());
        }
    }
}
