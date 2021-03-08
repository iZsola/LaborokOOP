package models;

import enums.DayOfWeek;
import enums.Degree;
import enums.Department;
import enums.Major;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("AVLMO7", "Anne", "Bell", Major.INFORMATION_SCIENCE);
        Student student2 = new Student("AVLMO5", "Nicholas", "Cage", Major.COMPUTER_SCIENCE);
        Student student3 = new Student("AVLMO9", "Joe", "White", Major.MECHATRONICS);
        Teacher teacher1 = new Teacher("Suzanne", "Grey", Degree.DOCENT,
                Department.MATHEMATICS_INFORMATICS);
        Teacher teacher2 = new Teacher("Daniel", "Craig", Degree.PROFESSOR,
                Department.APPLIED_LINGUISTICS);
        Teacher teacher3 = new Teacher("Bill", "Ford", Degree.ADJUNCT,
                Department.ELECTRICAL_ENGINEERING);
        Course course1 = new Course("MB_INFO20", 5, DayOfWeek.FRIDAY);
        course1.setTeacher(teacher1);
        course1.enrollStudent(student1);
        course1.enrollStudent(student2);
        course1.enrollStudent(student3);

        System.out.println(course1);

        University u=University.getInstance();
        u.LoadUniversityInformation();
        u.EnrollStudents();
        for (Course c : u.getCourses())
        {
            if(c==null)//ARRAY LISTTEL NEM LENNE ERRE SZUKSEG
                break;
            System.out.println(c.toString());
        }

    }

    public static void enrolledStudentsByMajor(Major major, String courseId)
    {
        for (Course c : University.getInstance().getCourses())
        {
            if (c==null) break;
            if (c.getCourseID().equals(courseId))
            {
                for (Student s : c.getEnrolledStudents())
                {
                    if (s.getMajor().equals(major))
                    {
                        System.out.println(s.toString());
                    }
                }
            }
        }
    }

    public static Course[] coursesByTeacherDegree(Degree degree)
    {
        University u=University.getInstance();
        int nrOfCourses=u.getNrOfCourses();
        int i=0;
        Course[] courses=new Course[nrOfCourses];
        for (Course c : u.getCourses())
        {
            if (c==null) break;
            if (c.getTeacher().getDegree().equals(degree))
            {
                courses[i++]=c;
            }
        }
        return courses;
    }

    public static int nrOfCoursesByDay(DayOfWeek day)
    {
        int res=0;
        University u=University.getInstance();
        for (Course c : u.getCourses())
        {
            if (c==null) break;
            if (c.getDayOfCourse().equals(day)) res++;
        }
        return res;
    }

    public static void cancelEnrollments(String fileName)
    {
        String path="Labor3Extra\\src\\"+fileName;
        try
        {
            File myObj = new File(path);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine())
            {
                String data=myReader.nextLine();
                for (Course c : University.getInstance().getCourses())
                {
                    if (c==null) break;
                    c.cancelEnrollmentOfStudent(data);
                }
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("An IO error occurred.");
        }
    }
}
