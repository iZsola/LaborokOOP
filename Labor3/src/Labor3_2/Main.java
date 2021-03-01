package Labor3_2;

import Labor3_1.BankAccount;
import Labor3_2.Customer;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("John", "BLACK");
        customer1.addAccount(new BankAccount("OTP123"));
        customer1.addAccount(new BankAccount("OTP45656"));
        System.out.println(customer1.toString());
    }
}
