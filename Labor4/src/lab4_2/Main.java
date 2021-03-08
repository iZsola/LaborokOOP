package lab4_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers=new ArrayList<>();
        customers=readPersonsFromCsv("Labor4/lab4_2_input.txt");
        for (Customer c : customers)
        {
            System.out.println(c.toString());
        }
    }

    public static ArrayList<Customer> readPersonsFromCsv(String filename)
    {
        Scanner scanner=null;
        try {
            scanner = new Scanner( new File(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        ArrayList<Customer> customers = new ArrayList<>();
        Customer c=null;
        while (scanner.hasNextLine())
        {
            String line = scanner.nextLine();
            if( line.isEmpty() ){
                continue;
            }
            String[] items = line.split(",");
            String type = items[0].trim();
            if (type.equals("Customer"))
            {
                if (c!=null) customers.add(c);
                String firstName = items[1].trim();
                String lastName = items[2].trim();
                c=new Customer(lastName, firstName);
            }
            else
            {
                String accNumber=items[1].trim();
                int balance = Integer.parseInt(items[2].trim());
                BankAccount bAccount=new BankAccount(accNumber);
                bAccount.deposit(balance);
                c.addAccount(bAccount);
            }
        }
        customers.add(c);

        return customers;
    }
}
