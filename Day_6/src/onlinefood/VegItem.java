package onlinefood;

class VegItem extends FoodItem implements Discountable {
    private double discount;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0;
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        discount = (calculateTotalPrice() * discountPercentage) / 100;
        System.out.println("Discount applied: " + discount);
    }

    @Override
    public String getDiscountDetails() {
        return "Total discount on Veg Item: " + discount;
    }
}

