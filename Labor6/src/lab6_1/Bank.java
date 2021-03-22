package lab6_1;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;


    public Bank(String bName)
    {
        customers=new ArrayList<>();
        this.name=bName;
    }
    public Customer getCustomer(int id)
    {
        for (Customer c : customers)
        {
            if (c.getId()==id)
                return c;
        }
        System.out.println("NO SUCH CUSTOMER!\n");
        return null;
    }

    public void AddCustomer(Customer c)
    {
        if (c!=null)
        {
            this.customers.add(c);
        }
    }

    public int NumCustomers()
    {
        return customers.size();
    }

    private void printCustomers( PrintStream ps ){
        ps.println("ID, Firstname, Last name, Number of bank accounts");
        for( Customer customer: customers ){
            ps.println( customer.getId()+", " + customer.getFirstName() +", "+
                    customer.getLastName()+", "+customer.getNumAccounts());
        }
    }

    public void printCustomersToStdout(){
        printCustomers( System.out );
    }

    public void printCustomersToFile(String fname)
    {
        try
        {
            printCustomers(new PrintStream(fname));
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
