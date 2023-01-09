package custom_linkedlist.doubly_linkedlist;

public class DoublyLinkedListMain {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.prepend(230);
        dll.prepend(990);
        dll.prepend(234);
         dll.prepend(20);
        dll.prepend(90);
        dll.prepend(34);


        dll.insert(230, 600);

        dll.display();
    }
}
