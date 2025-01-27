package bankingSystem;

public interface Loanable {
    void applyForLoan(double amount);

    void calculateLoanEligibility();
}
