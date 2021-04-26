package lab10_2;

import lab9_1.MyDate;

public class Student {
    private final String neptunID;
    private String firstname;
    private String lastname;
    private int credits;
    private final MyDate birthDate;

    public Student(String id, String fname, String lname, int credits, MyDate bDate)
    {
        this.neptunID=id;
        this.firstname=fname;
        this.lastname=lname;
        this.credits=credits;
        this.birthDate=bDate;
    }

    public String getNeptunID() {
        return neptunID;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getCredits() {
        return credits;
    }

    public String getBirthDate() {
        return birthDate.DateToString();
    }
}
