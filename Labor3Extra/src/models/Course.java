package models;

import enums.DayOfWeek;

public class Course {
    public static final int MAX_STUDENTS = 120;
    private Teacher teacher;
    private String courseID;
    private int numberOfCredits;
    private int numberOfEnrolledStudents;
    private Student[] enrolledStudents;
    private DayOfWeek dayOfCourse;

    public Course(String id, int credits, DayOfWeek d)
    {
        this.courseID=id;
        this.numberOfCredits=credits;
        this.dayOfCourse=d;
        enrolledStudents=new Student[MAX_STUDENTS];
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

    public Student[] getEnrolledStudents() {
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
        if (numberOfEnrolledStudents<MAX_STUDENTS)
        {
            enrolledStudents[numberOfEnrolledStudents++]=s;
        }
    }

    public void cancelEnrollmentOfStudent(String neptunC)
    {
        for (int i=0;i<numberOfEnrolledStudents;i++)
        {
            if (enrolledStudents[i].getNeptunCode().equals(neptunC))
            {
                enrolledStudents[i]=enrolledStudents[numberOfEnrolledStudents-1];
                break;
            }
        }
        numberOfEnrolledStudents--;
    }

    public String toString()
    {
        StringBuffer result = new StringBuffer();
        result.append("Teacher: "+ this.teacher.toString());
        result.append("Credits: " + this.numberOfCredits + "\n");
        result.append("Occurs every: " + this.dayOfCourse + "\n");
        result.append("Enrolled students: " + this.numberOfEnrolledStudents + "\n");
        for (int i=0;i<numberOfEnrolledStudents;i++)
        {
            result.append("\t - " + enrolledStudents[i].toString());
        }
        return result.toString();
    }

}
