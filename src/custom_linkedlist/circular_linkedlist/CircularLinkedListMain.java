package custom_linkedlist.circular_linkedlist;

public class CircularLinkedListMain {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        cll.prepend(34);
        cll.prepend(64);
        cll.prepend(31);
        cll.prepend(90);
        cll.prepend(54);
        cll.prepend(89);

        cll.display();

    }
}
