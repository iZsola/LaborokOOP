package lab6_1;

public class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(double overdraftLimit)
    {
        this.overdraftLimit=overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        if(balance - amount >= -(overdraftLimit)){
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                ", overdraftLimit=" + overdraftLimit +
                '}';
    }
}
