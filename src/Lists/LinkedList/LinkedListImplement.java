package Lists.LinkedList;

public class LinkedListImplement {
    public static void main(String[] args){
        MyLinkedList<Integer> ll =new MyLinkedList<>();
        ll.add(12);
        ll.add(13);
        ll.add(15);
        ll.add(17);
        ll.add(11);

        ll.print();
        ll.deleteBeg();
        ll.print();
    }
}
