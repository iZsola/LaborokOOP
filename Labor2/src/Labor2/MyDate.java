package Labor2;

public class MyDate {

    int year;
    int month;
    int day;
    public MyDate(int year, int month, int day)
    {
        this.year=year;
        this.month=month;
        this.day=day;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
    public int getYear() {
        return year;
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
