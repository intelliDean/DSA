package custom_linkedlist.singly.generics_singly_linkedlist;

public class GLinkedList<T>{
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public GLinkedList() {
    }


    public T getObject() {
        return head.getObject();
    }

    public void append(T object) {
        Node<T> node = new Node<>(object);
        node.setNext(head);
        head = node;
        tail = node;
        size++;
    }

    public int getSize() {
        return size;
    }
}
