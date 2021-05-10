package labor12_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListDictionary implements IDictionary {
    private ArrayList<String> words=new ArrayList<>();
    private static ArrayListDictionary instance=null;

    private ArrayListDictionary()
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

    public static ArrayListDictionary getInstance()
    {
        if (instance==null)
        {
            instance=new ArrayListDictionary();
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
        Collections.sort(words);
        return true;
    }

    @Override
    public boolean find(String word) {
        return Collections.binarySearch(words, word, String::compareToIgnoreCase) >= 0;
    }

    @Override
    public int size() {
        return this.words.size();
    }
}
