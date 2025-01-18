public class Book{
    private String title;
    private String author;
    private int price;
    // default constructor
    public Book(){
       
    }
    // parameterized constructor
    Book(String title, String author, int price){
         this.title=title;
        this.author=author;
        this.price=price;
    }
    // gether and setter methods
  /*   public String get title(){
        return title;
    }
    public void set title(String title){
        this.title=title;

    }*/
    public void display(){
        System.out.println("Title:"+title);
        System.out.println("author:"+author);
        System.out.println("price:"+price);

    }
    public static void main(String[] args){
        Book b1=new Book("The Alchemist","paolo coelho",500);
        b1.display();

    }

}