package bankingSystem;

class CurrentAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.02; // 2% annual interest

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public void calculateInterest() {
        double interest = getBalance() * INTEREST_RATE;
        System.out.println("Interest for Current Account (2%): " + interest);
    }
}
