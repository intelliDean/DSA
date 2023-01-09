package custom_linkedlist.doubly_linkedlist;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.ArrayList;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int size = 0;

    public DoublyLinkedList() {
    }

    public void prepend(int number) {
        Node node = new Node(number);

        node.setNext(head);
        node.setPrevious(null);

        if (head != null) {
            head.setPrevious(node);
        }

        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void append(int number) {
        if (tail == null) {
            prepend(number);
            return;
        }
        Node node = new Node(number);

        node.setPrevious(tail);
        node.setNext(null);

        if (tail != null) {
           tail.setNext(node);
        }
        tail = node;
        size++;
    }

    public void display() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.getValue() + " -> ");
            last = node;
            node = node.getNext();
        }
        System.out.println("END!");

        System.out.println("\nReverse printing");
        while (last != null) {
            System.out.print(last.getValue() + " <-  ");
            last = last.getPrevious();
        }
        System.out.println("START");
    }

    public void insert(int after, int number) {
        Node before = findByValue(after);

        if (before == null) {
            System.err.println("Null Pointer Index");
            return;
        }
        Node node = new Node(number);
        node.setNext(before.getNext());
        before.setNext(node);
        node.setPrevious(before);
        if (node.getNext() != null) {
            node.getNext().setPrevious(node);
        }
    }

    public Node findByValue(int value) {
        Node find = head;
        while (find != null) {
            if (find.getValue() == value) {
                return find;
            }
            find = find.getNext();
        }
        return null;
    }

    public ArrayList<Object> getAll() {
        ArrayList<Object> temp = new ArrayList<>();
        while (head != null) {
            temp.add(head.getValue());
            head = head.getNext();
        }
        return temp;
    }

    public int get(int index) {
        Node node = head;
        for (int i = 1; i <= index; i++) {
            node = node.getNext();
        }
        return node.getValue();
    }

    public Node findByIndex(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node;
    }

    public int deleteFirst() {
        int value = head.getValue();

        head = head.getNext();
        head.setPrevious(null);

        return value;
    }

    public int deleteLast() {
        int value = head.getValue();

        tail = tail.getPrevious();
        tail.setNext(null);

        return value;
    }

    public void delete(int index) {
        if (index == 0) {
            deleteFirst();
        }
        if (index == size - 1) {
            deleteLast();
        }
        Node temp = findByIndex(index - 1);
        temp.setNext(temp.getNext().getNext());
        temp.getNext().setPrevious(temp);
    }

    public void replyWith(int index, int number) {
        Node node = new Node(number);

        Node find = head;

        for (int i = 1; i < index; i++) {
            find = find.getNext();
        }
        Node next = find.getNext().getNext();
        node.setNext(next);
        next.setPrevious(node);
        find.setNext(node);
        node.setPrevious(find);
    }
}
