package lab9_2;

import lab9_1.MyDate;

public class Manager extends Employee {
    private String department;

    public Manager(String fname, String lname, double salary, MyDate bdate, String dep)
    {
        super(fname, lname, salary, bdate);
        this.department=dep;
    }

    public String getDepartment()
    {
        return this.department;
    }

    public void setDepartment(String s)
    {
        this.department=s;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "ID=" + ID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", birthDate=" + birthDate.DateToString() +
                ", department='" + department + '\'' +
                '}';
    }
}
