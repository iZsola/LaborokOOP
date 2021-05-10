package lab11_1;

public class Main {
    public static int counter=300;
    public static void main(String[] args) {
        /*String[] sa_array = new String[10];
        for (int i = 0; i < sa_array.length; i++)
            sa_array[i] = "";
        Thread producer = new AddToArray(sa_array);
        Thread t2=new TakeSomeFromArray(sa_array, "ppp", 10);
        producer.start();
        t2.start();
        if (counter<=0)
            return;
        */


        //MAIN2
        String[] sa_array = new String[10];
        for (int i = 0; i < sa_array.length; i++)
            sa_array[i] = "";
        Thread t3 = new AddToArray(sa_array);
        Thread t4 = new AddToArray(sa_array);
        Thread t5 = new AddToArray(sa_array);
        Thread t6 = new AddToArray(sa_array);
        Thread t7=new TakeSomeFromArray(sa_array, "aaa", 10);
        Thread t8=new TakeSomeFromArray(sa_array, "vvv", 10);
        Thread t9=new TakeSomeFromArray(sa_array, "hhh", 10);
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        if (counter<=0)
            return;
    }
}
