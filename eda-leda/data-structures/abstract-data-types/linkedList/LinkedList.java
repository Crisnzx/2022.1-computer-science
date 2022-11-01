package linkedList;

import genericDataStructure.GenericDataStructure;

public class LinkedList<T> implements GenericDataStructure<T> {
    private Node<T> firstElement = new Node<T>(null, null, null);

    @Override
    public void add(T element) {
        Node<T> current = this.firstElement;
        while (current.next != null) {
            current = current.next;
        }

        current.next = new Node<T>(element, current, null);

    }

    public void add (T element, int index) {

    }

    @Override
    public void remove(T element) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean contains(T element) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int length() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String toString() {
        return "vou cagar";
    }

}
