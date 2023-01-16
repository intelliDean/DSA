package custom_linkedlist.circular_linkedlist;

import java.util.ArrayList;

public class CircularLinkedList {
    private Node head;
    private Node tail;
    private int size = 0;

    public CircularLinkedList() {
    }

    public void add(int number) {
        Node node = new Node(number);

        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.setNext(node);
        node.setNext(head);
        tail = node;
        size++;
    }

    public void display() {
        Node node = head;

        if (node != null) {
            do {
                System.out.print(node.getValue() + " -> ");
                if (node.getNext() != null) {
                node = node.getNext();
                }
            } while (node != head);
            System.out.println("END!");
        }
    }

    public ArrayList<Object> getAll() {
        ArrayList<Object> temp = new ArrayList<>();
        Node node = head;
        if (node != null) {
            do {
                temp.add(node.getValue());
                if (node.getNext() != null) {
                    node = node.getNext();
                }
            } while (node != head);
        }
        return temp;
    }

    public void insert(int index, int number) {
        Node node = new Node(number);
        if (head == null) {
            add(number);
        }
        if (index > size) {
            add(number);
        }
        Node find = head;
        for (int i = 1; i < index; i++) {
            find = find.getNext();
        }
        node.setNext(find.getNext());
        find.setNext(node);
        size++;
    }

    public int get(int index) {
        if (index <= size) {
            Node get = head;
            for (int i = 0; i < index; i++) {
                get = get.getNext();
            }

            return get.getValue();
        }
        return Integer.MIN_VALUE;
    }

    public Node findByIndex(int index) {
        Node node = head;
        for (int j = 1; j <= index; j++) {
            node = node.getNext();
        }
        return node;
    }

    public Node findByValue(int nodeValue) {
        Node node = head;
        if (node != null) {
            do {
                if (node.getValue() == nodeValue) {
                    return node;
                }
                node = node.getNext();
            } while (node != head);
        }
        return null;
    }

    public void deleteFirst() {
        if (head == tail) {
            head = null;
            return;
        }
        tail.setNext(head.getNext());
        head = head.getNext();
    }

    public void deleteLast() {
        if (head == tail) {
            deleteFirst();
            return;
        }
        Node node = findByIndex(size - 1);

        node.setNext(head);
        tail = node;
    }

    public int deleteByValue(int nodeValue) {
        Node node  = head;
        for (int i = 1; i < size; i++) {
            if (head.getValue() == nodeValue) {
                node = node.getNext();
                break;
            }
        }
        int value = node.getNext().getValue();
        node.setNext(node.getNext().getNext());
        return value;
    }

    public int deleteByIndex(int index) {
        Node node = findByIndex(index - 1);

        int value = node.getNext().getValue();
        node.setNext(node.getNext().getNext());
        return value;
    }

    public void replaceWith(int before, int after) {
        Node node = new Node(after);
        Node find = head;
        for (int i = 0; i < size; i++) {
            if (head.getValue() == before) {
                find = head;
                break;
            }
        }
        node.setNext(find.getNext().getNext());
        find.setNext(node);
    }
}
