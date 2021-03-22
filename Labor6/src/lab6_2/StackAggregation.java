package lab6_2;

import java.util.ArrayList;

public class StackAggregation {
    ArrayList<Object> items;
    private int capacity;

    public StackAggregation(int capacity)
    {
        this.capacity=capacity;
        items=new ArrayList<>();
    }

    public boolean isFull()
    {
        return (items.size()==capacity);
    }

    public boolean isEmpty()
    {
        return (items.size()==0);
    }

    public void push(Object o)
    {
        if (items.size()<capacity)
        {
            items.add(o);
        }
    }

    public void pop()
    {
        if (!isEmpty())
            items.remove(items.size()-1);
    }

    public Object top()
    {
        if (!isEmpty())
            return items.get(items.size()-1);
        System.out.println("STACK IS EMPTY!\n");
        return null;
    }

    public int getSize()
    {
        return this.items.size();
    }
}
