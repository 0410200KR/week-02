public class MobilePhone {
    String brand;
    String model;
    int price;
    public MobilePhone(String brand,String model,int price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }
    public void display(){
        System.out.println("brand:"+brand);
        System.out.println("model:"+model);
        System.out.println("price:"+price);


    }
    public static void main(String[]args){
        MobilePhone obj=new MobilePhone("oneplus","CE3lite",25000);
        obj.display();
    }
    
}
