package models;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


//Singleton
class University {
    private static University _instance=null;
    public static final int MAX_COURSES=60;
    private int nrOfCourses;
    private Course[] courses;

    private University()
    {
        courses=new Course[MAX_COURSES];
    }

    public static University getInstance()
    {
        if (_instance==null)
        {
            _instance=new University();
        }
        return _instance;
    }

    public int getNrOfCourses() {
        return nrOfCourses;
    }

    public Course[] getCourses() {
        return courses;
    }


    public void AddCourse(Course c)
    {
        if (c!=null)
        {
            this.courses[nrOfCourses++]=c;
        }
    }

    public void LoadUniversityInformation()
    {
        Scanner myReader=null;
        try
        {
            File myObj = new File("Labor4Extra/university.csv");
            myReader = new Scanner(myObj);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("An IO error occurred.");
        }
        while (myReader.hasNextLine())
        {
            String data = myReader.nextLine();//Get course data
            Course c=CourseFactory.Create(data);//create course
            data = myReader.nextLine();//get teacher data
            c.setTeacher(TeacherFactory.Create(data));//create teacher
            AddCourse(c);//add course
        }
    }

    public void EnrollStudents()
    {
        Scanner myReader=null;
        try
        {
            File myObj = new File("Labor4Extra/students.csv");
            myReader = new Scanner(myObj);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("An IO error occurred.");
        }

        while (myReader.hasNextLine())
        {
            String data = myReader.nextLine();//Get student data
            Student s=StudentFactory.Create(data);
            data=myReader.nextLine();
            String[] myStr=data.split(",", 0);
            for (String str : myStr)
            {
                for (Course c : courses)
                {
                    if (c.getCourseID().equals(str))
                    {
                        c.enrollStudent(s);
                        break;
                    }
                }
            }
        }
    }
}
