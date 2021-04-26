package lab10_3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try
        {
            FileUtil.encode("Labor10/students.csv", "temp1.java");
            FileUtil.decode("temp1.java", "temp3.csv");
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
