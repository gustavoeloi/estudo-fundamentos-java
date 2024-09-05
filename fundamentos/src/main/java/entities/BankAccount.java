package entities;

// numero da conta, nome do titular, saldo da conta
public class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double accountBalance;

    private static final double TAX_TO_WITHDRAWAL = 6;

    public BankAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public BankAccount(int accountNumber, String accountHolder, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.accountBalance = accountBalance;
    }

    public void withdrawalBalance(double amount) {
        double totalWithdrawal = amount + TAX_TO_WITHDRAWAL;
        accountBalance = accountBalance - totalWithdrawal;
    }

    public void deposit(double amount) {
        this.accountBalance += amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    @Override
    public String toString() {
        return "Account holder name: " +
                accountHolder +
                " , Number account: " +
                accountNumber +
                " Account Balance: $ " +
                 accountBalance;
    }
}
