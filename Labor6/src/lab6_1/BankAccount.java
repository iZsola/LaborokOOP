package lab6_1;

public class BankAccount {
    protected double balance;
    protected final String accountNumber;
    public static final String PREFIX = "OTP";
    public static final int ACCOUNT_NUMBER_LENGTH = 10;
    private static int numAccounts = 0;


    protected BankAccount() {
        numAccounts++;
        this.accountNumber = generateAccountNumber();
    }

    //getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            return;
        }
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public String toString() {
        return String.format("Account number: %s\nBalance: %f\n",accountNumber,balance);
    }

    private static String generateAccountNumber() {
        StringBuffer result = new StringBuffer();
        result.append(PREFIX);
        result.append("0".repeat(ACCOUNT_NUMBER_LENGTH-PREFIX.length() - String.valueOf(numAccounts).length()));
        result.append(numAccounts);
        return result.toString();
    }
}