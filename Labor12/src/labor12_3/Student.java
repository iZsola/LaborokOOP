package labor12_3;

public class Student implements Comparable<Student> {
    private final int id;
    private final String firstName;
    private final String lastName;
    private float hungarianMark;
    private float romanianMark;
    private float mathsMark;
    private float bacAVG;
    private boolean passed;

    public Student(int id, String firstName, String lastName)
    {
        this.firstName=firstName;
        this.id=id;
        this.lastName=lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public float getHungarianMark() {
        return hungarianMark;
    }

    public boolean isPassed() {
        return passed;
    }

    public void setHungarianMark(float hungarianMark) {
        this.hungarianMark = hungarianMark;
    }

    public void setRomanianMark(float romanianMark) {
        this.romanianMark = romanianMark;
    }

    public void setMathsMark(float mathsMark) {
        this.mathsMark = mathsMark;
    }


    public void processResults()
    {
        bacAVG=(mathsMark+hungarianMark+romanianMark)/3;
        passed= mathsMark >= 5 && hungarianMark >= 5 && romanianMark >= 5 && bacAVG >= 6;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bacAVG=" + bacAVG +
                '}';
    }

    public int compareTo(Student o2) {

        int lastCmp = lastName.compareTo(o2.lastName);
        return (lastCmp != 0 ? lastCmp : firstName.compareTo(o2.firstName));
    }
}
