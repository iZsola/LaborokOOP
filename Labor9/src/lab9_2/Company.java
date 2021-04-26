package lab9_2;

import lab9_1.MyDate;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Company {
    private String name;
    private ArrayList<Employee> employees;

    public Company(String name)
    {
        this.name=name;
        employees=new ArrayList<>();
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return this.name;
    }

    public void hire(Employee e)
    {
        if (e!=null)
        {
            employees.add(e);
            return;
        }
        System.out.println("Can't add null!\n");
    }

    public void fire(int id)
    {
        for (Employee e : employees)
        {
            if (e.ID==id)
            {
                employees.remove(e);
                return;
            }
        }
        System.out.println("No such employee!\n");
    }

    public void hireAll(String fname)
    {
        String path="Labor9\\" + fname;
        try
        {
            File myObj = new File(path);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine())
            {
                String data = myReader.nextLine();
                String[] splitted=data.split(",");

                String firstname=splitted[0].trim();
                String lastname=splitted[1].trim();
                double salary=Double.parseDouble(splitted[2].trim());
                int year= Integer.parseInt(splitted[3].trim());
                int month= Integer.parseInt(splitted[4].trim());
                int day= Integer.parseInt(splitted[5].trim());
                if (splitted.length==6)
                {
                    employees.add(new Employee(firstname, lastname, salary, new MyDate(year, month, day)));
                }
                else
                {
                    String dep=splitted[6].trim();
                    employees.add(new Manager(firstname, lastname, salary, new MyDate(year, month, day), dep));
                }
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("An IO error occurred.");
        }
    }

    public void printAll(PrintStream ps)
    {
        for (Employee e : employees)
            ps.println(e);
    }

    public void sortByComparator(Comparator<Employee> comp)
    {
        Collections.sort(employees, comp);
    }
}
