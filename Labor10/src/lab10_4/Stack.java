package lab10_4;

import java.util.ArrayList;

public class Stack {
    ArrayList<Object> items;
    private int capacity;

    public Stack(int capacity)
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

    public void push(Object o) throws StackException
    {
        if (items.size()>=capacity)
            throw new StackException("Stack is full!\n");
        items.add(o);
    }

    public void pop() throws StackException
    {
        if (isEmpty())
            throw new StackException("STACK IS EMPTY!\n");
        items.remove(items.size()-1);
    }

    public Object top() throws StackException
    {
        if (isEmpty())
            throw new StackException("STACK IS EMPTY!\n");
        return items.get(items.size()-1);
    }

    public int getSize()
    {
        return this.items.size();
    }
}

