package custom_linkedlist.doubly_linkedlist;

import java.util.ArrayList;

public class DoublyLinkedList {

    private Node head;

    public DoublyLinkedList() {}

    public void prepend(int number) {
        Node node = new Node(number);
        node.setNext(head);
        node.setPrevious(null);
        if (head != null) {
            head.setPrevious(node);
        }
        head = node;
    }
    
    public void display() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.getValue()+" -> ");
            last = node;
            node = node.getNext();
        }
        System.out.println("END!");

        System.out.println("\nReverse printing");
        while (last != null) {
            System.out.print(last.getValue()+" <-  ");
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
        Node node =  new Node(number);
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


//    public Object[] getAll() {
//    }
//
//    public Object[] getAll() {
//        ArrayList<Object> temp = new ArrayList<>();
//        for (int i = 0; i < size; i++) {
//            if (findByIndex(i) != null) {
//                temp.add(get(i));
//            }
//        }
//        return temp;
//    }
}
