package Inheritance.hierarchical.banksystem;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA123", 10000, 3.5);
        CheckingAccount checking = new CheckingAccount("CA456", 5000, 1000);
        FixedDepositAccount fixed = new FixedDepositAccount("FD789", 20000, 12);

        savings.displayBalance();
        savings.displayAccountType();
        System.out.println();

        checking.displayBalance();
        checking.displayAccountType();
        System.out.println();

        fixed.displayBalance();
        fixed.displayAccountType();
    }
}
