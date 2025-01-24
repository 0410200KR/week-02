import java.util.ArrayList;
import java.util.List;
 class Book{
    String title;
    String author;
    public Book(String title, String author ){
        this.title=title;
        this.author=author;
    }}
    class Library {
        String name;
        // Aggregation relationship
         List<Book> books; 

         public Library(String name) {
            this.name = name;
            this.books = new ArrayList<>();
        }
        public void addBook(Book book){
            books.add(book);
        }
        public void displayBooks(){
        for (Book book : books) {
            System.out.println(book.title);}
        }
    }
    public class libraries{
     public static void main(String[] args) {
        
        Book book1 = new Book("Making India Awesome", "Chetan Bhagat");
        Book book2 = new Book("Bhagavad Gita ", "S. Radhakrishnan");
        Book book3 = new Book("French Revolution", "Thomas Carlyle");

       
        Library library1 = new Library("Common");
        Library library2 = new Library("Community Library");

        // Add books to libraries
        System.out.println("print detail of first library");
        library1.addBook(book1);
        library1.addBook(book2);

        library1.addBook(book3);

        
        library1.displayBooks();
        System.out.println("print detail of second library");
        library2.addBook(book1);
        library2.addBook(book2);

        library2.addBook(book3);
        library2.displayBooks();}
    }
            
    


