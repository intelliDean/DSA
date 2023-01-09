package custom_linkedlist.singly_linkedlist;

import java.util.ArrayList;
import java.util.Arrays;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size = 0;

    public LinkedList() {
    }

    public void prepend(int value) {
        Node node = new Node(value);
        node.setNext(head);         //everytime a new node is prepended, the created node is pointing to the head hence becoming the new head
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
        tail.setNext(node);     //every time a new node is appended, the tail is pointing to the new node hence becoming the new tail
        tail = node;
        size++;
    }

    public void insert(int number, int index) {
        if (index == 0) {
            prepend(number);
            return;
        }
        if (index == size) {
            append(number);
            return;
        }
        if (index > size) {
            System.err.println("Index out of bound");
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {       //stop at just before the index
            temp = temp.getNext();
        }
        Node node = new Node(number);
        node.setNext(temp.getNext());       //new node created is pointing at the object that used to be at this index hence taking its place and shifting it forward
        temp.setNext(node);             //the node at the index before the current index is pointing at the new node
        size++;
    }

    public int get(int index) {
        Node node = head;
        for (int i = 1; i <= index; i++) {
            node = node.getNext();
        }
        return node.getValue();
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

    public int deleteFirst() {
        int value = head.getValue();
        head = head.getNext();
        if (head == null) {
            tail = null;
        }
        size--;
        return value;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = findByIndex(size - 2);
        int value = tail.getValue();
        tail = secondLast;
        tail.setNext(null);
        size--;
        return value;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        Node before = findByIndex(index - 1);           //get the node reference just before the index to delete
        int value = before.getNext().getValue();        //get the value of the node to delete
        before.setNext(before.getNext().getNext());     //make the node just before the index to point at the node after the index to delete

        return value;       //return the value deleted
    }

    public Node findByIndex(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node;
    }

    @Override
    public String toString() {
        ArrayList<Object> temp = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (findByIndex(i) != null) {
                temp.add(get(i));
            }
        }
        Object[] arrays = temp.toArray();
        return Arrays.toString(arrays);
    }

    public ArrayList<Object> getAll() {
        ArrayList<Object> temp = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (findByIndex(i) != null) {
                temp.add(get(i));
            }
        }
        return temp;
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getValue() + " -> ");
            temp = temp.getNext();
        }
        System.out.println("END!");
    }


}
