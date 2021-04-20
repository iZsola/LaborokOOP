package lab9_2;

import lab9_1.MyDate;

public class Employee {
    protected final int ID;
    protected String firstName;
    protected String lastName;
    protected double salary;
    protected final MyDate birthDate;
    private static int counter=1;

    public Employee(String fname, String lname, double salary, MyDate bdate)
    {
        this.firstName=fname;
        this.lastName=lname;
        this.salary=salary;
        this.birthDate=bdate;
        this.ID=counter++;
    }

    public int getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public MyDate getBirthDate() {
        return birthDate;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", birthDate=" + birthDate +
                '}';
    }
}
