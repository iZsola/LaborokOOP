package lab4_2;

import lab4_2.BankAccount;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    //region fields

    private String firstName;
    private String lastName;
    private ArrayList<BankAccount> accounts;
    //endregion

    //region constructor
    public Customer(String lName, String fName)
    {
        this.firstName=fName;
        this.lastName=lName;
        accounts = new ArrayList<>();
    }
    //endregion

    //region properties
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
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

    public BankAccount getAccounts(String accNumber)
    {
        for (BankAccount b : this.accounts)
        {
            if (b.getAccountNumber().equals(accNumber))
            {
                return b;
            }
        }
        return null;
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
        result.append(firstName + ' ' + lastName + " accounts:\n");
        for (BankAccount b : this.accounts)
        {
            result.append("\t" + b.toString() + "\n");
        }
        return result.toString();
    }
    //endregion

}
