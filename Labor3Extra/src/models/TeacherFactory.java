package models;

import enums.Degree;
import enums.Department;

public class TeacherFactory {
    public static Teacher Create(String data)
    {
        String[] myStr=data.split(",", 0);
        String fname=myStr[0];
        String lname=myStr[1];
        Department department;
        Degree degree;
        switch (myStr[2])
        {
            case "PROFESSOR":
                degree=Degree.PROFESSOR;
                break;
            case "ADJUNCT":
                degree=Degree.ADJUNCT;
                break;
            case "ASSISTANT":
                degree=Degree.ASSISTANT;
                break;
            case "DOCENT":
                degree=Degree.DOCENT;
                break;
            default:
                degree=null;
                break;
        }

        int dep=Integer.parseInt(myStr[3]);
        switch (dep)
        {
            case 1:
                department=Department.APPLIED_LINGUISTICS;
                break;
            case 2:
                department=Department.APPLIED_SOCIAL_SCIENCE;
                break;
            case 3:
                department=Department.ELECTRICAL_ENGINEERING;
                break;
            case 4:
                department=Department.HORTICULTURE;
                break;
            case 5:
                department=Department.MATHEMATICS_INFORMATICS;
                break;
            case 6:
                department=Department.MECHANICAL_ENGINEERING;
                break;
            default:
                department=null;
                break;
        }
        return new Teacher(fname, lname, degree, department);
    }
}
