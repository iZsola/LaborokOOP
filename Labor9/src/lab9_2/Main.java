package lab9_2;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Company c=new Company("myComp");
        c.hireAll("employees.csv");
        c.printAll(System.out);

        System.out.println("\nSorted alphabetically:\n");
        c.sortByComparator(new Comparator<Employee>() {

            @Override
            public int compare(Employee o1, Employee o2)
            {
                if (o1.getFirstName().equals(o2.getFirstName()))
                {
                    return o1.getLastName().compareTo(o2.getLastName());
                }
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });

        c.printAll(System.out);

        System.out.println("\nSorted by salary:\n");
        c.sortByComparator(new Comparator<Employee>()
        {
            @Override
            public int compare(Employee o1, Employee o2)
            {
                return (int)(o2.salary-o1.salary);
            }
        });
        c.printAll(System.out);

        System.out.println("\nSorted by position, then alphabetically:\n");
        c.sortByComparator(new Comparator<Employee>()
        {
            @Override
            public int compare(Employee o1, Employee o2)
            {
                if (!(o1.getClass().equals(o2.getClass())))
                {
                    if (o1 instanceof Manager)
                        return -1;
                    return 1;
                }
                if (o1.getFirstName().equals(o2.getFirstName()))
                    return o1.getLastName().compareTo(o2.getLastName());

                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });
        c.printAll(System.out);
    }
}
