package lab9_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Storage {
    private ArrayList<Product> products;

    public Storage(String fname)
    {
        products=new ArrayList<>();
        String path="Labor9\\src\\" + fname;
        try {
            File myObj = new File(path);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] splitted = data.split(" ");
                int id=Integer.parseInt(splitted[0]);
                int amount=Integer.parseInt(splitted[2]);
                int price=Integer.parseInt(splitted[3]);
                Product p=new Product(id, splitted[1], amount, price);
                products.add(p);
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("An IO error occurred.");
        }
        Collections.sort(products, Product::compareTo);
    }

    public void Update(String fname)
    {
        String path="Labor9\\src\\" + fname;
        try {
            File myObj = new File(path);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] splitted = data.split(" ");
                int id=Integer.parseInt(splitted[0]);
                int amount=Integer.parseInt(splitted[1]);

                Product temp=new Product(id, null, 0, 0);
                int index=Collections.binarySearch(products, temp);
                if (index>=0)
                    products.get(index).increaseAmount(amount);
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("An IO error occurred.");
        }
    }

}
