package lab9_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand=new Random();
        ArrayList<MyDate> dates=new ArrayList<>();
        for (int i=0;i<10;i++)
        {
            int year=rand.nextInt(121)+1900;
            int month=Math.abs(rand.nextInt(12));
            int day=rand.nextInt()%32;
            if (DateUtil.isValidDate(year, month, day))
            {
                dates.add(new MyDate(year, month, day));
            }
            else
                i--;
        }
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
