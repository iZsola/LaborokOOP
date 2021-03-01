package Labor3_1;

public class Customer {
    private String firstName;
    private String lastName;
    private BankAccount account;

    public Customer(String lName, String fName)
    {
        this.firstName=fName;
        this.lastName=lName;
    }

    public void setAccount(BankAccount account)
    {
        if (account!=null)
        {
            this.account = account;
        }
    }

    public BankAccount getAccount()
    {
        return account;
    }

    public void closeAccount()
    {
        this.account=null;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(firstName + ' ' + lastName + ", account:\n");
        if (this.account!=null)
        {
            result.append(this.account.toString());
        }
        else
        {
            result.append("NO ACCOUNT FOUND!");
        }
        return result.toString();
    }
}
