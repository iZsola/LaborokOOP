package models;

import enums.DayOfWeek;

public class CourseFactory {
    public static Course Create(String data)
    {
        String[] myStr=data.split(",", 0);
        String ID=myStr[0];
        int credits=Integer.parseInt(myStr[1]);
        DayOfWeek d;
        int day=Integer.parseInt(myStr[2]);
        switch (day)
        {
            case 1:
                d=DayOfWeek.MONDAY;
                break;
            case 2:
                d=DayOfWeek.TUESDAY;
                break;
            case 3:
                d=DayOfWeek.WEDNESDAY;
                break;
            case 4:
                d=DayOfWeek.THURSDAY;
                break;
            case 5:
                d=DayOfWeek.FRIDAY;
                break;
            case 6:
                d=DayOfWeek.SATURDAY;
                break;
            case 7:
                d=DayOfWeek.SUNDAY;
                break;
            default:
                d=null;
                break;
        }
        return new Course(ID, credits, d);
    }
}
