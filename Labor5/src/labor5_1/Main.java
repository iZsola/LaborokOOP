package labor5_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*ArrayList<BankAccount> bAccounts=new ArrayList<>();
        for (int i=0;i<10;i++)
        {
            BankAccount b= new BankAccount();
            bAccounts.add(b);
        }
        for (BankAccount b : bAccounts)
        {
            System.out.println(b);
        }
        */
        ArrayList<Customer> customers=new ArrayList<>();
        Customer c=new Customer("ABC", "CDE");
        Customer c2=new Customer("ABC2", "CDE2");
        Customer c3=new Customer("ABC3", "CDE3");
        c.addAccount(new BankAccount());
        c2.addAccount(new BankAccount());
        c3.addAccount(new BankAccount());
        customers.add(c);
        customers.add(c2);
        customers.add(c3);
        /*for (Customer d : customers)
        {
            System.out.println(d.toString());
        }*/

        Bank bank=new Bank("OTP");
        c.addAccount(new BankAccount());
        c2.addAccount(new BankAccount());
        bank.AddCustomer(c);
        bank.AddCustomer(c2);
        System.out.println(bank.getCustomer(1));
        for (BankAccount b : bank.getCustomer(1).getAccounts())
        {
            b.deposit(100);
        }
        System.out.println(bank.getCustomer(1));
        bank.printCustomersToFile("bank_customers.csv");

    }
}
