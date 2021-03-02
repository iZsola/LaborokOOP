package models;

import enums.Major;

public class Student {

    private String lastName;
    private String firstName;
    private String neptunCode;
    private Major major;

    public Student(String lName, String fName, String code, Major m)
    {
        this.lastName=lName;
        this.firstName=fName;
        this.neptunCode=code;
        this.major=m;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getNeptunCode() {
        return neptunCode;
    }

    public Major getMajor() {
        return major;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMajor(Major major) {
        this.major = major;
    }
}
