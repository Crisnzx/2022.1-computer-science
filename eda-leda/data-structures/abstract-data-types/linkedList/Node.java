public class Node<T> {
    public Node<T> next;
    public Node<T> previous;
    public T element;

    public Node(T element, Node<T> previous, Node<T> next) {
        this.element = element;
        this.previous = previous;
        this.next = next;
    }

}
