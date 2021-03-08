package Lab4_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //readFilePrintItsLineNumbered("lab4_1_input.txt");
        ArrayList<Person> p = new ArrayList<>();
        p=readFromCSVFile("Labor4/lab4_1_input.csv");
        printPerson(p);
    }

    public static void readFilePrintItsLineNumbered( String fileName )
    {
        Scanner scanner=null;
        int i=1;
        try {
            scanner = new Scanner( new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNextLine())
        {
            String data=scanner.nextLine();
            System.out.println(i + " " + data);
            i++;
        }
    }

    public static ArrayList<Person> readFromCSVFile(String fileName)
    {
        Scanner scanner=null;
        try {
            scanner = new Scanner( new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<Person> persons = new ArrayList<>();
        while (scanner.hasNextLine())
        {
            String line = scanner.nextLine();
            if( line.isEmpty() ){
                continue;
            }
            String[] items = line.split(",");
            String firstName = items[0].trim();
            String lastName = items[1].trim();
            int birthYear = Integer.parseInt(items[2].trim());
            persons.add( new Person(firstName, lastName, birthYear));
        }

        return persons;
    }

    public static void printPerson(ArrayList<Person> a)
    {
        for (Person p : a)
        {
            System.out.println(p.toString());
        }
    }
}
