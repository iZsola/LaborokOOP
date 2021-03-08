package models;

import enums.Degree;
import enums.Department;

public class Teacher {
    public static int currentNumberOfTeachers=0;
    private String lastName;
    private String firstName;
    private Degree degree;
    private Department department;
    private int teacherID;

    public Teacher(String fName, String lName, Degree degree, Department department)
    {
        this.lastName=lName;
        this.firstName=fName;
        this.degree=degree;
        this.department=department;
        currentNumberOfTeachers++;
    }

    public int getCurrentNumberOfTeachers() {
        return currentNumberOfTeachers;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Degree getDegree() {
        return degree;
    }

    public Department getDepartment() {
        return department;
    }

    public int getTeacherID() {
        return teacherID;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String toString()
    {
        StringBuffer result = new StringBuffer();
        result.append(firstName + " " + lastName + " - " +this.degree + " from " + this.department + " department\n");
        return result.toString();
    }
}
