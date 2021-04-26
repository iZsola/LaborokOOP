package lab10_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        String[] spl=s.split(" ");
        float res=0;
        for (String str : spl)
        {
            try {
                res+=Double.parseDouble(str);
            }
            catch (NumberFormatException e)
            {
                System.out.println("Nem numerikus!\n");
            }
        }

        System.out.println("Result = " + res);
    }
}
