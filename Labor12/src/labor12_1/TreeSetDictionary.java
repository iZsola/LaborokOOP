package labor12_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetDictionary implements IDictionary {
    private TreeSet<String> words=new TreeSet<>();
    private static TreeSetDictionary instance=null;

    private TreeSetDictionary()
    {
        try (Scanner scanner=new Scanner(new File(DICTIONARY_FILE))){
            while (scanner.hasNextLine())
            {
                String line=scanner.nextLine();
                words.add(line);
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
            System.out.println("File not found: " + DICTIONARY_FILE);
        }

    }

    public static TreeSetDictionary getInstance()
    {
        if (instance==null)
        {
            instance=new TreeSetDictionary();
        }
        return instance;
    }

    @Override
    public boolean add(String word) {
        if (find(word))
        {
            System.out.println("The word is already in the dictionary");
            return false;
        }
        words.add(word);
        return true;
    }

    @Override
    public boolean find(String word) {
        return words.contains(word);
    }

    @Override
    public int size() {
        return this.words.size();
    }
}
