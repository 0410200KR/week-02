package onlinefood;

class NonVegItem extends FoodItem implements Discountable {
    private double additionalCharge;
    private double discount;

    public NonVegItem(String itemName, double price, int quantity, double additionalCharge) {
        super(itemName, price, quantity);
        this.additionalCharge = additionalCharge;
        this.discount = 0;
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + additionalCharge;
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        discount = (calculateTotalPrice() * discountPercentage) / 100;
        System.out.println("Discount applied: " + discount);
    }

    @Override
    public String getDiscountDetails() {
        return "Total discount on Non-Veg Item: " + discount;
    }
}

