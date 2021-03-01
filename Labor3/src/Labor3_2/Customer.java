package Labor3_2;

import Labor3_1.BankAccount;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    //region fields
    public static final int MAX_ACCOUNTS = 10;

    private String firstName;
    private String lastName;
    private int numAccounts=0;
    private List<BankAccount> accounts;
    //endregion

    //region constructor
    public Customer(String lName, String fName)
    {
        this.firstName=fName;
        this.lastName=lName;
        accounts=new ArrayList<BankAccount>();
    }
    //endregion

    //region properties
    public int getNumAccounts()
    {
        return numAccounts;
    }
    //endregion


    //region methods
    public void addAccount(BankAccount account)
    {
        if (account!=null&&numAccounts<MAX_ACCOUNTS)
        {
            numAccounts++;
            this.accounts.add(account);
        }
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

    public void closeAccount(String accountNumber)
    {
        for (BankAccount b : accounts)
        {
           if (b.getAccountNumber().equals(accountNumber))
           {
               this.accounts.remove(b);
               numAccounts--;
               break;
           }
        }
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(firstName + ' ' + lastName + " accounts:\n");
        for(int i=0; i<numAccounts; ++i){
            result.append( "\t" + accounts.get(i).toString() +"\n");
        }
        return result.toString();
    }
    //endregion

}
