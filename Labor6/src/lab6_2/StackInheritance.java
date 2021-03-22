package lab6_2;

import java.util.ArrayList;

public class StackInheritance extends ArrayList {

    private int capacity;

    public StackInheritance(int capacity)
    {
        this.capacity=capacity;
    }

    public boolean isFull()
    {
        return (this.capacity==this.size());
    }

    public boolean isEmpty()
    {
        return (this.size()==0);
    }

    public void push(Object o)
    {
        if (this.size()<capacity)
        {
            this.add(o);
        }
    }

    public void pop()
    {
        if (!isEmpty())
            this.remove(this.size()-1);
    }

    public Object top()
    {
        if (!isEmpty())
            return this.get(this.size()-1);
        System.out.println("STACK IS EMPTY!\n");
        return null;
    }

    public int getSize()
    {
        return this.size();
    }



}
