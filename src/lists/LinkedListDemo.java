package lists;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args){

        LinkedList l = new LinkedList();

        l.add(100);
        l.add("welcome");
        l.add(15.5);
        l.add('A');
        l.add(true);
        l.add(null);

        System.out.println("my Linked List: "+l); // [100, welcome, 15.5, A, true, null]
        System.out.println("my Linked List size is: "+l.size()); // 6

        //remove
        l.remove(3); // remove by index
        System.out.println("my Linked List after removing by index = 3: "+l); // [100, welcome, 15.5, true, null]

        l.remove(true); // remove by Object
        System.out.println("my Linked List after removing by Object  = true: "+l); // [100, welcome, 15.5, null]

        // Insert
        l.add(3,"Java");
        System.out.println("my Linked List after inserting object in 3. position "+l); // [100, welcome, 15.5, Java, null]

        //Retrieve

        System.out.println("retrieving the 3. element "+l.get(3)); // Java

        //change the value
        l.set(4,'X');
        System.out.println("my Linked List after adding X in position 5 "+l); // [100, welcome, 15.5, Java, X]


        // specific methods
        LinkedList ll = new LinkedList();
        ll.add("dog");
        ll.add("cat");
        ll.add("horse");

        ll.addFirst("Tiger");
        ll.addLast("Elephant");
        System.out.println("my Linked List after adding First and Last = "+ll); // [Tiger, dog, cat, horse, Elephant]

        System.out.println("my First element: "+ll.getFirst()); // Tiger
        System.out.println("my Last element: "+ll.getLast()); // Elephant

        ll.removeFirst();
        ll.removeLast();
        System.out.println("my Linked List after removing First and Last = "+ll); // [dog, cat, horse]




    }
}
