 public class HandleBook {
 
    String title;
    String author;
    int price;
    public HandleBook(String title,String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;

    }
    public void display(){
        System.out.println("Title:"+title);
        System.out.println("Author:"+author);
        System.out.println("price:"+price);
    }
    public static void main(String[] args) {
        String title="JAVA";
        String author="james gosling";
        int price=5000;
        HandleBook obj=new HandleBook( title, author,price);
        obj.display();
    }
 }