package lab6_1;

public class Main {
    public static void main(String[] args) {
        Bank myBank=new Bank("OTP");
        Customer c=new Customer("ABS", "ASAD");
        Customer c2=new Customer("ABS", "ASAD");
        myBank.AddCustomer(c);
        myBank.AddCustomer(c2);
        myBank.getCustomer(1).addAccount(new CheckingAccount(1000));
        myBank.getCustomer(1).addAccount(new SavingsAccount(0.1));
        myBank.getCustomer(2).addAccount(new SavingsAccount(0.3));
        myBank.getCustomer(2).addAccount(new CheckingAccount(2000));
        for (BankAccount b : myBank.getCustomer(1).getAccounts())
        {
            b.deposit(200);
        }
        for (BankAccount b : myBank.getCustomer(2).getAccounts())
        {
            b.deposit(500);
        }

        for (int i=1;i<=myBank.NumCustomers();i++)
        {
            System.out.println(myBank.getCustomer(i));
        }

        for (BankAccount b : myBank.getCustomer(1).getAccounts())
        {
            b.withdraw(100);
        }
        for (BankAccount b : myBank.getCustomer(2).getAccounts())
        {
            b.withdraw(100);
        }

        for (int i=1;i<=myBank.NumCustomers();i++)
        {
            System.out.println(myBank.getCustomer(i));
        }
    }
}
