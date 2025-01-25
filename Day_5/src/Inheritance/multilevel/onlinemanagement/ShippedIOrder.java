package Inheritance.multilevel.onlinemanagement;

 class ShippedlOrder extends order{
    int trackingNumber;
    ShippedlOrder(int orderId, String orderDate,int trackingNumber){
        super(orderId, orderDate);
        this.trackingNumber=trackingNumber;
    }
    @Override
    void getOrderStatus(){
        System.out.println("OrderId: "+orderId+" orderDate: "+orderDate+" trackingNumber: "+trackingNumber);

    }

}