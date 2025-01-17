import java.util.Scanner;

public class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;

    public MovieTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void bookTicket() {
        System.out.println("Ticket booked for " + movieName + ", Seat Number: " + seatNumber + ", Price: " + price);
    }

    public void displayTicket() {
        System.out.println("Movie: " + movieName + ", Seat: " + seatNumber + ", Price: " + price);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter movie name: ");
        String movieName = scanner.nextLine();

        System.out.print("Enter seat number: ");
        String seatNumber = scanner.nextLine();

        System.out.print("Enter ticket price: ");
        double price = scanner.nextDouble();

        MovieTicket ticket = new MovieTicket(movieName, seatNumber, price);
        ticket.bookTicket();
        ticket.displayTicket();
    }
}
