package labor5_1;

public class BankAccount {
    private double balance;
    private final String accountNumber;
    public static final String PREFIX = "OTP";
    public static final int ACCOUNT_NUMBER_LENGTH = 10;
    private static int numAccounts = 0;


    public BankAccount(){
        numAccounts++;
        this.accountNumber = generateAccountNumber();
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

    private static String generateAccountNumber()
    {
        StringBuffer result = new StringBuffer();
        result.append(PREFIX);
        for (int i=0;i<7-String.valueOf(numAccounts).length();i++)
        {
            result.append(0);
        }
        result.append(numAccounts);
        return result.toString();
    }

}