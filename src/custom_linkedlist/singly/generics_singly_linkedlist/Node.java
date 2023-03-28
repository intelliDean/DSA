package custom_linkedlist.singly.generics_singly_linkedlist;

public class Node<T> {
    private final T object;
    private Node next;

    public Node(T t) {
        this.object = t;
    }

    public Node(T t, Node next) {
        this.object = t;
        this.next = next;
    }

    public T getObject() {
        return object;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
