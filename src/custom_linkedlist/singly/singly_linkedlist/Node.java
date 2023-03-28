package custom_linkedlist.singly.singly_linkedlist;

public class Node {
    private int value;
    private Node next;

    public Node(int value) {
        this.value = value;
    }

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    public void setNext(Node node) {
        next = node;
    }
    public Node getNext(){
        return next;
    }
    public int getValue() {
        return value;
    }
}
