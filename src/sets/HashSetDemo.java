package sets;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args){

        HashSet hs = new HashSet(); // default capacity 16, Load factor 0.75
        HashSet<Integer> hsi = new HashSet<Integer>();

        // Add elements into HashSet
        hs.add(100);

        hs.add('A');
        hs.add(15.5);
        hs.add("welcome");
        hs.add(true);
        hs.add(null);


        System.out.println("my HashSet is :"+hs); //[null, A, 100, welcome, 15.5, true]

        //size of HashSet
        System.out.println("size of my HashSet  " +hs.size());


        // transform to array and retrieve by index
        Object[] a= hs.toArray();

        System.out.println("retrieve index 2 -> " +a[2]);


        //remove

        hs.remove(15.5);
        System.out.println("my HashSet after removing 15.5 is :"+hs); //[null, A, 100, welcome, true]

        //contains
        System.out.println("my HashSet contains welcome :"+hs.contains("welcome")); //true
        System.out.println("my HashSet contains welcome :"+hs.contains("Welcome")); //false

        //isEmpty()
        System.out.println("my HashSet is empty :"+hs.isEmpty()); //false

        //reading elements from hashSet
        for(Object e: hs){
            System.out.println(e);
        }


        HashSet<Integer> ihs = new HashSet<Integer>();

        ihs.add(2);
        ihs.add(4);
        ihs.add(6);

        System.out.println("HashSet of Integers : "+ihs);

        //addAll()
        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.addAll(ihs);
        numbers.add(10);
        System.out.println("HashSet of numbers : "+numbers); //[2, 4, 6, 10]

        //removeAll()
        numbers.removeAll(ihs);
        System.out.println("HashSet of numbers after removeAll(ihs): "+numbers); //[10]




        // Union Intersection , difference

        System.out.println("************ Set methods **************");
        HashSet<Integer> set1 = new HashSet<Integer>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        HashSet<Integer> orgSet1 = new HashSet<Integer>();
        orgSet1.addAll(set1);
        System.out.println("HashSet of set1 : "+set1);

        HashSet<Integer> set2 = new HashSet<Integer>();
        set2.add(3);
        set2.add(4);
        set2.add(6);
        System.out.println("HashSet of set2 : "+set2);

        //union
        set1.addAll(set2);
        System.out.println("Union : "+set1);
        set1.clear();
        set1.addAll(orgSet1);


        //intersection
        set1.retainAll(set2);
        System.out.println("Intersection : "+set1);
        set1.clear();
        set1.addAll(orgSet1);

        //difference
        set1.removeAll(set2);
        System.out.println("Difference : "+set1);
        set1.clear();
        set1.addAll(orgSet1);

        //subset
        System.out.println("subset : "+set1.containsAll(set2));







    }
}
