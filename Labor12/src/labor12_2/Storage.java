package labor12_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Storage {
    private HashMap<Integer, Product> products= new HashMap<>();
    private int updatedProducts=0;

    public Storage(String fname)
    {
        String path="Labor12\\" + fname;
        try (Scanner scanner=new Scanner(new File(path))){
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                String[] splitted = data.split(" ");
                int id=Integer.parseInt(splitted[0]);
                int amount=Integer.parseInt(splitted[2]);
                int price=Integer.parseInt(splitted[3]);
                Product p=new Product(id, splitted[1], amount, price);
                products.put(id, p);
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("An IO error occurred.");
        }
    }

    public void Update(String fname)
    {
        String path="Labor12\\" + fname;
        try (Scanner myReader=new Scanner(new File(path))){
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] splitted = data.split(" ");
                int id=Integer.parseInt(splitted[0].trim());
                int amount=Integer.parseInt(splitted[1].trim());

                Product temp=products.get(id);
                if (temp!=null)
                {
                    products.get(temp.getIdentifier()).increaseAmount(amount);
                    updatedProducts++;
                }
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("An IO error occurred.");
        }
        System.out.printf("%d products were updated!\n", updatedProducts);
    }

}
