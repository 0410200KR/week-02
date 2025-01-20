import java.util.*;

public class BankAccount {
   String accountHolder;
     final int accountNumber;
    static String bankName="SBI";
     private static int totalAccounts;
     int balance;

   
    public BankAccount(String accountHolder,int accountNumber,int balance){
      this.accountHolder=accountHolder;
      this.accountNumber=accountNumber;
      totalAccounts++;

    }
    public static void getTotalAccounts(){
        System.out.println("total number of  "+bankName+" accounts: "+totalAccounts);
    }
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
        System.out.println("Bank Name: " + bankName);
    }

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            System.out.print("Enter account holder name: ");
            String accountHolder = sc.nextLine();
    
            System.out.print("Enter account number: ");
            int accountNumber = sc.nextInt();
            System.out.print("Enter amount: ");
            int balance= sc.nextInt();
            BankAccount account = new BankAccount(accountHolder, accountNumber,balance);
            BankAccount account2 = new BankAccount(accountHolder, accountNumber,balance);

            if (account instanceof BankAccount) { 
                System.out.println("Account details are valid.");
            }
            account.displayBalance();
            BankAccount.getTotalAccounts();
    }


    
}
