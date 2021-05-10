package labor12_2;

public class Main {
    public static void main(String[] args) {
        long startTime=System.nanoTime();
        Storage storage=new Storage("data1000000.txt");
        storage.Update("update10000000.txt");
        long endTime=System.nanoTime();
        long timeElapsed=endTime-startTime;
        System.out.println("ime elapsed: " + timeElapsed/1000000);
    }
}
