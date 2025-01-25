package Inheritance.multilevel.onlinemanagement;

public class order {
    int orderId;
    String orderDate;
    order(int orderId, String orderDate){
        this.orderId=orderId;
        this.orderDate=orderDate;
    }
    void getOrderStatus(){
        System.out.println("OrderId: "+orderId+" orderDate: "+orderDate);

    }
}
