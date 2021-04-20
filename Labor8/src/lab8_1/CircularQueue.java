package lab8_1;

import java.util.ArrayList;
import java.util.Objects;

public class CircularQueue implements IQueue {

    private final int CAPACITY;
    private Object[] items;
    private int front;
    private int rear;

    public CircularQueue(int capacity)
    {
        this.CAPACITY=capacity;
        items=new Object[CAPACITY];
        front=-1;
        rear=-1;
    }

    @Override
    public boolean isEmpty() {
        return (front == -1);
    }

    @Override
    public boolean isFull() {
        if (front == 0 && rear == CAPACITY - 1) {
            return true;
        }
        return (front == rear + 1);
    }

    @Override
    public void enQueue(Object o) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1)
                front = 0;
            rear = (rear + 1) % CAPACITY;
            items[rear] = o;
        }
    }

    @Override
    public Object deQueue() {
        Object element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        } else {
            element = items[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } /* Q has only one element, so we reset the queue after deleting it. */
            else {
                front = (front + 1) % CAPACITY;
            }
            return element;
        }
    }

    @Override
    public void printQueue() {
        if (isEmpty())
        {
            //System.out.println("EMPTY QUEUE");
            return;
        }
        int i;
        for (i=front;i!=rear;i=(i+1)%CAPACITY)
        {
            System.out.print(items[i]+ " ");
        }
        System.out.println(items[i]);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        CircularQueue that = (CircularQueue) o;
        if ((o == null || getClass() != o.getClass()) || that.CAPACITY!=this.CAPACITY) return false;


        Object[] temp=new Object[CAPACITY];
        int i, index=0;
        for (i=front;i!=rear;i=(i+1)%CAPACITY)
        {
            temp[index++]=items[i];
        }
        temp[index]=items[i];
        index=0;
        for (i=that.front;i!=that.rear;i=(i+1)%that.CAPACITY)
        {
            if (that.items[i]!=temp[index++])
                return false;
        }
        return true;
    }
}
