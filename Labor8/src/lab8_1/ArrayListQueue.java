package lab8_1;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListQueue implements IQueue {

    private ArrayList<Object> items;
    private final int CAPACITY;

    public ArrayListQueue(int capacity)
    {
        items=new ArrayList<>();
        this.CAPACITY=capacity;
    }

    @Override
    public boolean isEmpty() {
        return this.items.size()==0;
    }

    @Override
    public boolean isFull() {
        return this.CAPACITY==this.items.size();
    }

    @Override
    public void enQueue(Object o) {
        if (!this.isFull()) {
            if (o != null) {
                this.items.add(o);
                return;
            }
            System.out.println("\nCan't add null!\n");
            return;
        }
        System.out.println("\nQUEUE IS FULL!\n");
    }

    @Override
    public Object deQueue() {
    if (!this.isEmpty()){
        Object o=this.items.get(0);
        this.items.remove(0);
        return o;
    }
    System.out.println("\nQUEUE IS EMPTY!\n");
    return null;
    }

    @Override
    public void printQueue() {
    for (int i=0;i<items.size();i++)
    {
        System.out.print(this.items.get(i) + " ");
    }
    System.out.println();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayListQueue that = (ArrayListQueue) o;
        return Objects.equals(items, that.items);
    }
}
