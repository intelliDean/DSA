package custom_linkedlist.circular_linkedlist;

public class CircularLinkedListMain {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        cll.add(54);
        cll.add(23);
        cll.add(65);
        cll.add(5);
        cll.add(23);



        cll.display();
        cll.replaceWith(23, 899);
        cll.display();

    }
}
