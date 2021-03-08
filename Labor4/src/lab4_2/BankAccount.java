package lab4_2;

public class BankAccount {
    private double balance;
    private String accountNumber;

    public BankAccount( String accountNumber ){
        this.accountNumber = accountNumber;
    }

    //getters
    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if(amount <= 0){
            return;
        }
        balance += amount;
    }

    public boolean withdraw(double amount){
        if(amount > balance){
            return false;
        }
        balance -= amount;
        return true;
    }

    public String toString()
    {
        StringBuffer result = new StringBuffer();
        result.append(accountNumber + ", balance: "+ balance);
        return result.toString();
    }
}