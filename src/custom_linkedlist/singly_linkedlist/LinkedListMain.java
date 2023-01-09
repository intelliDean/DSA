package custom_linkedlist.singly_linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.append(67);
        list.prepend(20);
        list.append(43);
        list.append(89);
        list.append(78);
        list.append(54);
        list.prepend(90);
        System.out.println(list.getAll());
        list.insert(100, 4);
       // list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.delete(3));
//        System.out.println(list.getAll());

        //System.out.println(list);
        System.out.println(list.getAll());

    }
}
