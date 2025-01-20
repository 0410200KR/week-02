public class Product {
    static double discount=40;
    final int productId;
    String productName;
    static int price;
    static int quantity;
    public Product(String productName,int price, int quantity,int productId){
        this.productName=productName;
        this.price=price;
        this.quantity=quantity;
        this.productId=productId;

    }
    public static Double updateDiscount(){
        double finalDiscount=(price*40/100)*quantity;
        return finalDiscount;
    }
    void display(){
        System.out.println("Name:" +productName);
        
        System.out.println("quantity:" +quantity);
        System.out.println("price:" +price);
        System.out.println("Id:" +productId);
    }
    public static void main(String[]args){
        Product  pr = new Product ("sugar",60,8,89);
        if (pr instanceof Product ) { 
            System.out.println("Product details are valid.");
        }
        pr.display();
        System.out.println(Product.updateDiscount());
    }

}
