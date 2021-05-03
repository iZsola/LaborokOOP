package lab11_1;

public class TakeSomeFromArray extends Thread {
    private String[] array;
    private String toRemove;
    private int count;
    public TakeSomeFromArray(String[] array, String toRemove, int count)
    {
        this.array=array;
        this.count=count;
        this.toRemove=toRemove;
    }

    @Override
    public void run()
    {
        while (count>0 && Main.counter>0)
        {
            synchronized (this.array)
            {
                for (int i = 0; i < array.length; i++) {
                    if (array[i].compareTo(toRemove) == 0) {
                        array[i] = " ";
                        count--;
                        Main.counter--;
                        System.out.println(toRemove + " removed " + (10-count) + " Times");
                    }
                }
            }
        }
    }
}
