package lab10_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String path="Labor10\\students.csv";
        try {
            FileWriter myWriter = new FileWriter("Labor10\\warning.csv");
            File myObj = new File(path);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] splitted = data.split(",");
                for (int i=0;i<splitted.length;i++)
                    splitted[i]=splitted[i].trim();

                if (splitted.length!=7)
                {
                    System.out.println("INCOMPLETE LINE: " + data);
                    continue;
                }

                if (!(splitted[3].matches("-?\\d+") && splitted[4].matches("-?\\d+") &&
                        splitted[5].matches("-?\\d+") && splitted[6].matches("-?\\d+")))
                {
                    System.out.println("NUMBER FORMAT EXCEPITON: " + data);
                    continue;
                }

                String date=splitted[4]+"-"+splitted[5]+"-"+splitted[6];
                if (!(isValid(date)))
                {
                    System.out.println("INVALID DATE: "+ data);
                    continue;
                }

                if (Integer.parseInt(splitted[3])<30)
                    myWriter.write(data);

            }
            myWriter.close();
        }
        catch (IOException e)
        {
            System.out.println("An IO error occurred.");
        }


    }


    public static boolean isValid(final String date) {

        boolean valid;

        try {

            // ResolverStyle.STRICT for 30, 31 days checking, and also leap year.
            LocalDate.parse(date,
                    DateTimeFormatter.ofPattern("uuuu-M-d")
                            .withResolverStyle(ResolverStyle.STRICT)
            );

            valid = true;

        } catch (DateTimeParseException e) {
            valid = false;
        }

        return valid;
    }
}
