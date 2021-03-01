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
}
