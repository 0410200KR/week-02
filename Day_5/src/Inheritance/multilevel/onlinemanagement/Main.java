package Inheritance.multilevel.onlinemanagement;

public class Main {
    public static void main(String[]args){
        order shippedOrder=new ShippedlOrder(89, "21 januray", 567);
        ShippedlOrder deliveredOrder=new DeliveredOrder(90, "21 januray", 67879, "25 januray");

        shippedOrder.getOrderStatus();
        deliveredOrder.getOrderStatus();}

}
