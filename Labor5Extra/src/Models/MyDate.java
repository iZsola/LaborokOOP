package Models;

import Utils.DateUtil;

public class MyDate{
    private int year;
    private int day;
    private int month;
    private boolean valid;

    public MyDate(int day, int month, int year)
    {
        this.day=day;
        this.month=month;
        this.year=year;
        this.valid= DateUtil.isValidDate(year, month, day);
    }

    public int getYear() {
        return year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public boolean isValid() {
        return valid;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public String DateToString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(day);
        sb.append("/");
        sb.append(month);
        sb.append("/");
        sb.append(year);
        return sb.toString();
    }
}
