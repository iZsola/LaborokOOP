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
    private BankAccount[] accounts;
    //endregion

    //region constructor
    public Customer(String lName, String fName)
    {
        this.firstName=fName;
        this.lastName=lName;
        accounts=new BankAccount[MAX_ACCOUNTS];
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
            this.accounts[numAccounts++]=account;
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

    public BankAccount[] getAccounts()
    {
        BankAccount[] accs;
        accs=new BankAccount[numAccounts];
        for (int i=0;i<numAccounts;i++)
        {
            accs[i]=accounts[i];
        }
        return accs;
    }

    public void closeAccount(String accountNumber)
    {
        for (int i=0;i<numAccounts;i++)
        {
            if (this.accounts[i].getAccountNumber().equals(accountNumber))
            {
                this.accounts[i]=this.accounts[--numAccounts];
                break;
            }
        }
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(firstName + ' ' + lastName + " accounts:\n");
        for(int i=0; i<numAccounts; ++i){
            result.append( "\t" + accounts[i].toString() +"\n");
        }
        return result.toString();
    }
    //endregion

}
