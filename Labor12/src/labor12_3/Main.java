package labor12_3;

public class Main {
    public static void main(String[] args) {
        Database p = new Database("Labor12\\nevek1.txt");
        p.readMathMarks("Labor12\\matek.txt");
        p.readHungarianMarks("Labor12\\magyar.txt");
        p.readRomanianMarks("Labor12\\roman.txt");
        p.calculateResults();
        p.PrintFailedStudents();
        System.out.println("Number of students who passed: " + p.getPassedNr());
    }
}
