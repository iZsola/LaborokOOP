package lab6_1;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    //region fields

    private String firstName;
    private String lastName;
    private ArrayList<BankAccount> accounts;
    private static int numOfCustomers=1;
    private final int id;
    //endregion

    //region constructor
    public Customer(String lName, String fName)
    {
        this.firstName=fName;
        this.lastName=lName;
        accounts = new ArrayList<>();
        this.id=numOfCustomers;
        numOfCustomers++;
    }
    //endregion

    //region properties
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    public ArrayList<String> getAccountNumbers()
    {
        ArrayList<String> res=new ArrayList<>();
        for (BankAccount b : accounts)
        {
            res.add(b.getAccountNumber());
        }
        return res;
    }
    //endregion


    //region methods
    public void addAccount(BankAccount account)
    {
        if (account!=null)
            this.accounts.add(account);
    }

    public BankAccount getAccount(String accountNumber)
    {
        for (BankAccount b : accounts)
        {
            if (b.getAccountNumber().equals(accountNumber))
                return b;
        }
        return null;
    }

    public int getNumAccounts()
    {
        return accounts.size();
    }

    public ArrayList<BankAccount> getAccounts()
    {
        return this.accounts;
    }

    public void closeAccount(String accountNumber)
    {
        for (BankAccount b : this.accounts)
        {
            if (b.getAccountNumber().equals(accountNumber))
            {
                this.accounts.remove(b);
                break;
            }
        }
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(firstName + ' ' + lastName + ", id:" + getId() +  ", accounts:\n");
        for (BankAccount b : this.accounts)
        {
            result.append("\t" + b.toString() + "\n");
        }
        return result.toString();
    }
    //endregion

}
