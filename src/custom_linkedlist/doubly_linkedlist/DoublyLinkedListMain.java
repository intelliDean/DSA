package custom_linkedlist.doubly_linkedlist;

public class DoublyLinkedListMain {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.append(20);
        dll.append(30);
        dll.append(230);
        dll.append(320);
        dll.append(200);


        dll.display();

        System.out.println(dll.findIndex(200));
//        dll.delete(2);
//        System.out.println();
//        dll.display();
//        dll.prepend(990);
//        dll.prepend(234);
//         dll.prepend(20);
//        dll.prepend(90);
//        dll.prepend(34);
//
//        System.out.println(dll.get(3));
//        Node node = dll.findByIndex(3);
//        System.out.println(node.getValue());


        //dll.insert(230, 600);

        //dll.display();

    }
}
