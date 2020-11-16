package Lists.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_collection {
    public static void main(String[] args){
        List ll=new LinkedList();
        ll.add(12);
        ll.add(13);
        ll.add(15);
        ll.set(1,17);
        System.out.println(ll);
    }
}
