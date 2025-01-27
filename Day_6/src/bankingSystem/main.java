package bankingSystem;

public class main {
    public static void main(String[] args) {
        // Polymorphism: Handling different account types
        BankAccount savingsAccount = new SavingsAccount("S123", "Ali", 5000);
        BankAccount currentAccount = new CurrentAccount("C456", "Bela", 10000);

        savingsAccount.deposit(2000);
        savingsAccount.withdraw(1000);
        savingsAccount.calculateInterest();

        currentAccount.deposit(5000);
        currentAccount.withdraw(7000);
        currentAccount.calculateInterest();


    }
}
