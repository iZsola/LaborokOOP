package models;

import enums.DayOfWeek;

import java.util.ArrayList;

public class Course {
    private Teacher teacher;
    private String courseID;
    private int numberOfCredits;
    private int numberOfEnrolledStudents;
    private ArrayList<Student> enrolledStudents;
    private DayOfWeek dayOfCourse;

    public Course(String id, int credits, DayOfWeek d)
    {
        this.courseID=id;
        this.numberOfCredits=credits;
        this.dayOfCourse=d;
        enrolledStudents=new ArrayList<>();
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public String getCourseID() {
        return courseID;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public int getNumberOfEnrolledStudents() {
        return numberOfEnrolledStudents;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public DayOfWeek getDayOfCourse() {
        return dayOfCourse;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void enrollStudent(Student s)
    {
        if (s!=null)
            enrolledStudents.add(s);
    }

    public void cancelEnrollmentOfStudent(String neptunC)
    {
        for (Student s : enrolledStudents)
        {
            if (s.getNeptunCode().equals(neptunC))
            {
                enrolledStudents.remove(s);
                break;
            }
        }
    }

    public String toString()
    {
        StringBuffer result = new StringBuffer();
        result.append("Teacher: "+ this.teacher.toString());
        result.append("Credits: " + this.numberOfCredits + "\n");
        result.append("Occurs every: " + this.dayOfCourse + "\n");
        result.append("Enrolled students: " + this.numberOfEnrolledStudents + "\n");

        for (Student s : enrolledStudents)
        {
            result.append("\t - " + s.toString());
        }
        return result.toString();
    }

}
