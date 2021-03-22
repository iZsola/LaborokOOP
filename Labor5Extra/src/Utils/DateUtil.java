package Utils;

public class DateUtil {
    public static boolean leapYear(int year)
    {
        if (year % 4 == 0) {

            // if the year is century
            if (year % 100 == 0) {

                // if year is divided by 400
                // then it is a leap year
                if (year % 400 == 0)
                    return true;
                else
                    return false;
            }

            // if the year is not century
            else
                return true;
        }

        else
            return false;
    }

    public static boolean isValidDate(int year, int month, int day)
    {
        if (day<1 || day>31) return false;
        if (month==2)
        {
            if (leapYear(year))
            {
                if (day<29) return false;
            }
            else
            {
                return true;
            }
        }
        if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
        {
            if (day!=31) return false;
        }
        else
        {
            if (day!=30) return false;
        }
        return true;
    }
}