import java.util.*;

    class Bank {
         String accountHolder;
        final int accountNumber;
        private double balance;
        private static String bankName="SBI";
        private static int totalAccounts;
    
        public Bank(String accountHolder, int accountNumber, double balance) {
            this.accountHolder = accountHolder;
            this.accountNumber = accountNumber;
            this.balance = balance;
            totalAccounts++;
        }
        public static  void getTotalAccounts(){
            System.out.println("total number of accounts: "+totalAccounts);
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
            System.out.println("Bank Name: " + bankName);
        }
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter account holder name: ");
            String accountHolder = scanner.nextLine();
    
            System.out.print("Enter account number: ");
            int accountNumber = scanner.nextInt();
    
            System.out.print("Enter initial balance: ");
            double balance = scanner.nextDouble();
    
            Bank account = new Bank(accountHolder, accountNumber, balance);
            Bank account2 = new Bank(accountHolder, accountNumber, balance);
            // Using instanceof to check the object type
            if (account instanceof Bank) { 
                System.out.println("Account details are valid.");
            }

            System.out.print("Enter amount to deposit: ");
            double depositAmount = scanner.nextDouble();
            account.deposit(depositAmount);
    
            System.out.print("Enter amount to withdraw: ");
            double withdrawAmount = scanner.nextDouble();
            account.withdraw(withdrawAmount);
        
    
            account.displayBalance();
            
            Bank.getTotalAccounts();
        }
    }
     

     