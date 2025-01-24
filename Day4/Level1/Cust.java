import java.util.ArrayList;
import java.util.List;

// Account class
class Account {
    String accountNumber;
     double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
    }
}

// Customer class
class Customer {
   String name;
    private List<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("Customer: " + name);
        for (Account account : accounts) {
            account.displayAccountDetails();
        }
    }

}

// Bank class
class Bank {
    String name;
    List<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public void openAccount(Customer customer, Account account) {
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        customer.addAccount(account);
        System.out.println("Account opened for " +customer.name + " at " + name);
    }

    public void displayCustomers() {
        System.out.println("Bank: " + name);
        for (Customer customer : customers) {
            System.out.println("Customer: " + customer.name);
        }
    }
}


public class Cust {
    public static void main(String[] args) {
        // Create Bank
        Bank bank = new Bank("Central Bank");

        // Create Customers
        Customer customer1 = new Customer("Amey");
        Customer customer2 = new Customer("Bob");

        // Create Accounts
        Account account1 = new Account("AC456", 1500.0);
        Account account2 = new Account("AC1232", 1000.0);
        Account account3 = new Account("AC8907", 2000.0);

        // Open Accounts
        bank.openAccount(customer1, account1);
        bank.openAccount(customer1, account2);
        bank.openAccount(customer2, account3);

        // View Balances
        customer1.viewBalance();
        customer2.viewBalance();

        // Display Customers in Bank
        bank.displayCustomers();
    }
}

