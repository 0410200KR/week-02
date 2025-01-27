package eCommercePlatform;

 class Clothing extends Product implements Taxable {
    private static final double TAX_RATE = 0.12; // 12% tax
    private double discountRate;

    public Clothing(int productId, String name, double price, double discountRate) {
        super(productId, name, price);
        this.discountRate = discountRate;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate / 100;
    }

    @Override
    public double calculateTax() {
        return getPrice() * TAX_RATE;
    }

    @Override
    public String getTaxDetails() {
        return "Tax rate for Clothing: " + (TAX_RATE * 100) + "%";
    }
}
