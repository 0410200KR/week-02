class Item{
    String itemName;
    int itemCode;
    int itemPrice;
    public Item(String itemName,int itemCode,int itemPrice)
      {
        this.itemName=itemName;
        this.itemCode =itemCode;
        this.itemPrice=itemPrice;
      }
      public void display(int quantity){
        int cost=quantity*itemPrice;
        System.out.println("Item name:"+itemName);
        System.out.println("Item code:"+itemCode);
        System.out.println("Item price:"+itemPrice);
        System.out.println("total cost:"+quantity+"Item :"+cost);
      }

}
public class TrackInventory {
    public static void main(String[]args){
       
        Item obj=new Item("pen",205,30);
        obj.display(6);

    }
}
