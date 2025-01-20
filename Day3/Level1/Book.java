public class Book {
    static String libraryName="central library";
    String title;
    String author;
    final long isbn;
    public Book(String title,String author,long isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;

    }

    public static void displayLibraryName(){
        System.out.println("library Name:" +libraryName);
    }
    void display(){
        System.out.println("Title:" +title);
        System.out.println("Author:" +author);
        System.out.println("isbn:" +isbn);
    }
    public static void main(String[]args){
        Book bk = new Book("Atomic Habits", "James Clear",8897809);
        if (bk instanceof Book) { 
            System.out.println("book details are valid.");
        }
        bk.display();
        Book.displayLibraryName();
    }
    
}
