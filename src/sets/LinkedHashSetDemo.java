package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args){

        LinkedHashSet lset = new LinkedHashSet();

        //HashSet lset = new HashSet();

        lset.add(100);
        lset.add(200);
        lset.add(300);
        lset.add(400);
        lset.add(500);

        System.out.println("my LinkedHashSet is in order :"+lset); //[100, 200, 300, 400, 500]


    }
}
