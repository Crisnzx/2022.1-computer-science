package src.queue;

import src.queue.exceptions.QueueOverflowException;
import src.queue.exceptions.QueueUnderflowException;

public class QueueImpl<T> implements Queue<T> {

    @Override
    public void enqueue(T element) throws QueueOverflowException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public T dequeue() throws QueueUnderflowException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T head() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isFull() {
        // TODO Auto-generated method stub
        return false;
    }
    
}