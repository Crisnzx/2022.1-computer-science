package genericDataStructure;

public interface GenericDataStructure<T> {
    public void add(T element);

    public void remove(T element);

    public boolean contains(T element);

    public int length();

    public boolean isEmpty();
}