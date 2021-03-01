package Labor3_2;

import Labor3_1.BankAccount;
import Labor3_2.Customer;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Customer customer1 = new Customer("John", "BLACK");
        Customer customer2 = new Customer("Walter", "White");
        customer1.addAccount(new BankAccount("OTP123"));
        customer1.addAccount(new BankAccount("OTP432546"));
        customer1.addAccount(new BankAccount("OTP4565666"));
        customer1.addAccount(new BankAccount("OTP45611156"));
        customer1.addAccount(new BankAccount("OTP45622256"));
        customer2.addAccount(new BankAccount("OTP1"));
        customer2.addAccount(new BankAccount("OTP2"));
        customer2.addAccount(new BankAccount("OTP3"));
        customer2.addAccount(new BankAccount("OTP4"));
        customer2.addAccount(new BankAccount("OTP5"));
        customer2.addAccount(new BankAccount("OTP6"));
        customer2.addAccount(new BankAccount("OTP7"));
        customer2.addAccount(new BankAccount("OTP8"));
        customer2.addAccount(new BankAccount("OTP9"));
        Customer[] customers = new Customer[2];
        customers[0]=customer1;
        customers[1]=customer2;

        for (Customer c : customers)
        {
            System.out.println(c.toString());
        }

        for (Customer c : customers)
        {
            for (BankAccount b : c.getAccounts())
            {
                b.deposit(rand.nextInt(1000));
            }
        }
        customers[0].closeAccount("OTP123");
        customers[1].closeAccount("OTP9");

        for (Customer c : customers)
        {
            System.out.println(c.toString());
        }
    }
}
