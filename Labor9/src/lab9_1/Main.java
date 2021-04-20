package lab9_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand=new Random();
        for (int i=0;i<10;i++)
        {
            int year=rand.nextInt()%13;
        }
        ArrayList<MyDate> dates=new ArrayList<>();
        dates.add(new MyDate(2021, 1, 1));
        dates.add(new MyDate(2021, 10, 6));
        dates.add(new MyDate(2021, 5, 7));
        dates.add(new MyDate(2021, 2, 21));
        dates.add(new MyDate(2021, 3, 10));
        dates.add(new MyDate(2021, 12, 22));
        dates.add(new MyDate(2021, 11, 30));
        dates.add(new MyDate(2021, 6, 10));
        dates.add(new MyDate(2021, 5, 2));
        dates.add(new MyDate(2021, 8, 1));
        for (MyDate d : dates)
        {
            System.out.println(d.DateToString());
        }
        System.out.println("--------");
        Collections.sort(dates);
        for (MyDate d : dates)
        {
            System.out.println(d.DateToString());
        }
    }
}
