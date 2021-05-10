package labor12_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Database {
    private HashMap<Integer, Student> students=new HashMap<>();
    private int passedNr=0;
    public Database(String Filename) {
        try(Scanner in = new Scanner(new File(Filename)))
        {
            while (in.hasNextLine()) {
                String line= in.nextLine();
                String[] tokens=line.split("\\s+");
                int id= Integer.parseInt(tokens[0].trim());
                String lname=tokens[1].trim();
                String fname=tokens[2].trim();
                students.put(id, new Student(id, fname, lname));
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    public HashMap<Integer, Student> getStudents() {
        return students;
    }

    public int getPassedNr() {
        return passedNr;
    }

    public void readMathMarks(String FileName){
        try (Scanner in = new Scanner(new File(FileName))){
            while (in.hasNextLine())
            {
                String line=in.nextLine();
                String[] tokens=line.split("\\s+");
                students.get(Integer.parseInt(tokens[0].trim()))
                        .setMathsMark(Float.parseFloat(tokens[1].trim()));
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    public void readHungarianMarks(String FileName)
    {
        try (Scanner in = new Scanner(new File(FileName))){
            while (in.hasNextLine())
            {
                String line=in.nextLine();
                String[] tokens=line.split("\\s+");
                students.get(Integer.parseInt(tokens[0].trim()))
                        .setHungarianMark(Float.parseFloat(tokens[1].trim()));
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    public void readRomanianMarks(String Filename)
    {
        try (Scanner in = new Scanner(new File(Filename))){
            while (in.hasNextLine())
            {
                String line=in.nextLine();
                String[] tokens=line.split("\\s+");
                students.get(Integer.parseInt(tokens[0].trim()))
                        .setRomanianMark(Float.parseFloat(tokens[1].trim()));
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    public void calculateResults()
    {
        for (Student s : students.values())
        {
            s.processResults();
            if (s.isPassed())
                passedNr++;
        }
    }

    public void PrintFailedStudents()
    {
        TreeSet<Student> s=new TreeSet<>();
        for (Student stud : students.values())
        {
            if (!stud.isPassed())
                s.add(stud);
        }
        for (Student stud : s)
        {
            System.out.println(stud.toString());
        }
    }
}
