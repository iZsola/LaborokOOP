package lab9_1;

public class MyDate implements Comparable<MyDate> {

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
        sb.append(year);
        sb.append("/");
        sb.append(month);
        sb.append("/");
        sb.append(day);
        return sb.toString();
    }

    @Override
    public int compareTo(MyDate o) {

        if (this.year == o.year)
        {
            if (this.month == o.month)
            {
                return this.day-o.day;
            }
            return this.month-o.month;
        }
        return this.year - o.year;
    }
}