package Lists.LinkedList;

public class MyLinkedList<E> {
    Node<E> head=null;
    Node<E> tail=null;

    // adding node to linkedList
    public void add(E data){
        Node<E> toAdd = new Node<>(data);

        if (head==null){
            head=toAdd;
            tail=toAdd;
            return;
        }

        Node<E> temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=toAdd;
        tail=toAdd;
    }

    // printing nodes of the linkedList
    public void print(){
        if(head==null){
            System.out.println("No element to print");
            return;
        }
        Node<E> temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    // delete node from begining
    public void deleteBeg(){
        if (head==null){
            System.out.println("No elemet to delete");
            return;
        }
        if(head==tail){
            head=tail=null;
            System.out.println("deletion done");
        }else {
            head=head.next;
        }
    }

    // delete node from end
    public void deleteEnd(){
        if (head==null){
            System.out.println("No element to remove");
            return;
        }
        if(head==tail){
            head=tail=null;
            return;
        }
        Node<E> temp=head;
        while (temp.next!=tail){
            temp=temp.next;
        }
        tail=temp;
        tail.next=null;
    }

   static class Node<E>{
        E data;
        Node<E> next;
        public Node(E data){
            this.data=data;
            this.next=null;
        }
    }
}
