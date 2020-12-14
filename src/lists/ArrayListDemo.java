package lists;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String[] args){

        // Declare an ArrayList
        ArrayList al1 = new ArrayList(); // for holding heterogeneous data
        ArrayList<Integer> aln = new ArrayList<Integer>();      // for holding Integer numbers
        ArrayList<String> als = new ArrayList<String>();        // for holding Strings

        // add new elements to the ArrayList
        al1.add(100);
        al1.add("welcome");
        al1.add(15.5);
        al1.add('A');
        al1.add(true);
        al1.add(null);

        System.out.print(al1); // [100, welcome, 15.5, A, true]

        // find size of the ArrayList

        System.out.println("\nNumber of Elements in array list: "+al1.size());


        //remove
        al1.remove(1);
        System.out.println(al1);                //[100, 15.5, A, true]

        //add by index
        al1.add(1,"welcome");
        System.out.println(al1);                //[100, welcome, 15.5, A, true]
        al1.add(5,"far out");
        System.out.println(al1);                //[100, welcome, 15.5, A, true, far out]

        //retrieve specific element
        System.out.println(al1.get(2)); // 15.5

        //change element/replace
        al1.set(0,200);
        System.out.println(al1);                //[200, welcome, 15.5, A, true, far out]

        //searching
        System.out.println(al1.contains("far out")); // true
        System.out.println(al1.contains("far away")); // false

        //isEmpty()
        System.out.println(al1.isEmpty()); // false


        // retrieve all data:
        // 1. for loop
        System.out.println("\nReading element using for loop....");
        for (int i =0 ;i<al1.size();i++){
            System.out.println(al1.get(i));
        }

        // 2. for..each loop
        System.out.println("\nReading element using enhanced loop....");
        for(Object e:al1){
            System.out.println(e);
        }

        System.out.println("\nReading element using for...each loop & lamda expressions ....");
        al1.forEach(element-> System.out.println(element));

        //3. iterator()
        System.out.println("\nReading element using iterator method");
        Iterator it = al1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }



        //remove all
        ArrayList al1_dup = new ArrayList();
        al1_dup.addAll(al1); // now al1_dup equal al1
        System.out.println("\nal1_dup = "+al1_dup);
        al1_dup.removeAll(al1);
        System.out.println("\n After removing : al1_dup = "+al1_dup);

        // sorting
        als.add("X");
        als.add("Y");
        als.add("Z");
        als.add("A");
        als.add("B");
        als.add("C");

        System.out.println("String list = "+als);
        Collections.sort(als);
        System.out.println("Sorted list = "+als);
        Collections.sort(als,Collections.reverseOrder());
        System.out.println("Reverse Sorted list = "+als);


        // convert array to ArrayList

        String arr[] = {"dog", "cat", "elephant"};
        ArrayList<String> as = new ArrayList<String>(Arrays.asList(arr));

        System.out.println(" Data from converted Array: "+as);
        for(String element:arr){
            System.out.println(element);
        }

        // clear List
        as.clear();
        System.out.println("Cleared List = "+as);






    }
}
