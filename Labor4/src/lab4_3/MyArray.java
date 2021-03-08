package lab4_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class MyArray {
    private int length;
    private double[] elements;

    public MyArray(int l)
    {
        this.length=l;
        this.elements=new double[l];
    }

    public MyArray(double[] d)
    {
        this.length=d.length;
        this.elements=new double[length];
        for (int i=0;i<length;i++)
        {
            elements[i]=d[i];
        }
    }

    public MyArray(MyArray source)
    {
        this.length=source.length;
        this.elements=new double[length];
        for (int i=0;i<length;i++)
        {
            this.elements[i]=source.elements[i];
        }
    }

    public MyArray(String fileName)
    {
        Scanner scanner=null;
        try {
            scanner = new Scanner( new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        this.length=scanner.nextInt();
        this.elements=new double[length];
        int i=0;
        while (scanner.hasNextInt())
        {
            this.elements[i++]=scanner.nextInt();
        }
    }

    public void fillRandom(double min, double max)
    {
        for (int i=0;i<this.length;i++)
        {
            elements[i]=(int)(Math.random() * (max - min)) + min;
        }
    }

    public double mean()
    {
        double s=0;
        for (int i=0;i<this.length;i++)
        {
            s+=elements[i];
        }
        return (s/this.length);
    }

    public void sort()
    {
        Arrays.sort(elements);
    }

    public double stddev()
    {
        double standardDeviation = 0.0;

        double mean=this.mean();

        for(double num: elements) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        return Math.sqrt(standardDeviation/length);
    }

    public void print(String s)
    {
        System.out.print(s + ":");
        for (double d : elements)
        {
            System.out.print(d+ " ");
        }
        System.out.println("\n");
    }
}
