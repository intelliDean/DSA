package custom_linkedlist.circular_linkedlist;

public class CircularLinkedList {
    //private int size = 0;
    private Node head;
    private Node tail;

    public CircularLinkedList() {}

    public void prepend(int number) {
        Node node = new Node(number);

        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.setNext(node);
        node.setNext(head);
        tail = node;
    }

    public void display() {
        Node node = head;

        if (node != null){
            do {
                System.out.print(node.getValue()+" -> ");
                node = node.getNext();
            } while (node != head);
            System.out.println("END!");
        }
    }
}
