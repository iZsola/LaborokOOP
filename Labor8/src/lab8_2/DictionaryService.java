package lab8_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DictionaryService {
    private IDictionary dictionary;

    public DictionaryService(DictionaryType dt)
    {
        dictionary=DictionaryProvider.createDictionary(dt);
    }

    public boolean findWord(String s)
    {
        return dictionary.find(s);
    }

    public ArrayList<String> findWordsFile(String s)
    {
        ArrayList<String> res=new ArrayList<>();
        Scanner scanner=null;
        try {
            scanner=new Scanner(new File(s));
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
            System.out.println("File not found: " + s);
        }
        while (scanner.hasNextLine())
        {
            String line=scanner.nextLine();

            String regex = "[a-zA-Z]+";
            Pattern pattern = Pattern.compile(regex);
            //Creating a Matcher object
            Matcher matcher = pattern.matcher(line);
            while(matcher.find()) {
                String temp=matcher.group();
                if (!findWord(temp))
                    res.add(temp);
            }
        }
        return res;
    }
}
