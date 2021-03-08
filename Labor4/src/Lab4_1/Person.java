package Lab4_1;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(String lname, String fname, int byear)
    {
        this.lastName=lname;
        this.firstName=fname;
        this.birthYear=byear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String toString()
    {
        StringBuffer result = new StringBuffer();
        result.append(this.firstName + " " + this.lastName + ", Birth year: " + this.birthYear + "\n");
        return result.toString();
    }
}
