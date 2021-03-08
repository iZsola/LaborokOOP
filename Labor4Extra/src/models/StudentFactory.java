package models;

import enums.Major;

public class StudentFactory {
    public static Student Create(String data)
    {
        String[] myStr=data.split(",", 0);
        String neptunCode=myStr[0];
        String fname=myStr[1];
        String lname=myStr[2];
        Major m;
        switch (myStr[3])
        {
            case "AUTOMATION_AND_APPLIED_INFORMATICS":
                m=Major.AUTOMATION_AND_APPLIED_INFORMATICS;
                break;
            case "COMMUNICATION_AND_PUBLIC_RELATIONS":
                m=Major.COMMUNICATION_AND_PUBLIC_RELATIONS;
                break;
            case "COMPUTER_SCIENCE":
                m=Major.COMPUTER_SCIENCE;
                break;
            case "HORTICULTURAL_ENGINEERING":
                m=Major.HORTICULTURAL_ENGINEERING;
                break;
            case "INFORMATION_SCIENCE":
                m=Major.INFORMATION_SCIENCE;
                break;
            case "LANDSCAPE_ARCHITECTURE":
                m=Major.LANDSCAPE_ARCHITECTURE;
                break;
            case "MECHATRONICS":
                m=Major.MECHATRONICS;
                break;
            case "MANUFACTURING_ENGINEERING":
                m=Major.MANUFACTURING_ENGINEERING;
                break;
            case "PUBLIC_HEALTH_SERVICES_AND_POLICIES":
                m=Major.PUBLIC_HEALTH_SERVICES_AND_POLICIES;
                break;
            case "TELECOMMUNICATION":
                m=Major.TELECOMMUNICATION;
                break;
            case "TRANSLATION_AND_INTERPRETING_STUDIES":
                m=Major.TRANSLATION_AND_INTERPRETING_STUDIES;
                break;
            default:
                m=null;
                break;
        }
        return new Student(neptunCode, fname, lname, m);
    }
}
