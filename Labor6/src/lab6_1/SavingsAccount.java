package lab6_1;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(double interestRate)
    {
        this.interestRate=interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }


    public void addInterest()
    {
        this.balance+=this.interestRate*this.balance;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                ", interestRate=" + interestRate +
                '}';
    }
}
