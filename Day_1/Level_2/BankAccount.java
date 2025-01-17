
    import java.util.Scanner;

    class BankAccount {
        private String accountHolder;
        private int accountNumber;
        private double balance;
    
        public BankAccount(String accountHolder, int accountNumber, double balance) {
            this.accountHolder = accountHolder;
            this.accountNumber = accountNumber;
            this.balance = balance;
        }
    
        public void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        }
    
        public void withdraw(double amount) {
            if (amount > balance) {
                System.out.println("Insufficient balance");
            } else {
                balance -= amount;
                System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
            }
        }
    
        public void displayBalance() {
            System.out.println("Current Balance: " + balance);
        }
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter account holder name: ");
            String accountHolder = scanner.nextLine();
    
            System.out.print("Enter account number: ");
            int accountNumber = scanner.nextInt();
    
            System.out.print("Enter initial balance: ");
            double balance = scanner.nextDouble();
    
            BankAccount account = new BankAccount(accountHolder, accountNumber, balance);
    
            System.out.print("Enter amount to deposit: ");
            double depositAmount = scanner.nextDouble();
            account.deposit(depositAmount);
    
            System.out.print("Enter amount to withdraw: ");
            double withdrawAmount = scanner.nextDouble();
            account.withdraw(withdrawAmount);
    
            account.displayBalance();
        }
    }
     

