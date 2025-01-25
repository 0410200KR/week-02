package Inheritance.multilevel.onlinemanagement;

public class DeliveredOrder extends ShippedlOrder{
    String deliveryDate;
    DeliveredOrder(int orderId, String orderDate,int trackingNumber,String deliveryDate){
        super(orderId, orderDate,trackingNumber);
        this.deliveryDate=deliveryDate;

    }
    @Override
    void getOrderStatus(){
        System.out.println("OrderId: "+orderId+" orderDate: "+orderDate+" trackingNumber: "+trackingNumber);

    }


}