package LibraryManagement;

public class Main {
    public static void main(String[] args) {
        // Polymorphism: General reference for all items
        LibraryItem book = new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald");
        LibraryItem magazine = new Magazine("M001", "National Geographic", "Multiple Authors");
        LibraryItem dvd = new DVD("D001", "Inception", "Christopher Nolan");

        book.getItemDetails();
        System.out.println("Loan Duration: " + book.getLoanDuration() + " days\n");

        magazine.getItemDetails();
        System.out.println("Loan Duration: " + magazine.getLoanDuration() + " days\n");

        dvd.getItemDetails();
        System.out.println("Loan Duration: " + dvd.getLoanDuration() + " days\n");

        // Reservable example
        Reservable reservableBook = (Reservable) book;
        reservableBook.reserveItem("Alex");
        System.out.println("Book availability: " + reservableBook.checkAvailability());

        Reservable reservableMagazine = (Reservable) magazine;
        reservableMagazine.reserveItem("rita");
        System.out.println("Magazine availability: " + reservableMagazine.checkAvailability());

        Reservable reservableDVD = (Reservable) dvd;
        reservableDVD.reserveItem("sakshi");
        System.out.println("DVD availability: " + reservableDVD.checkAvailability());
    }
}
