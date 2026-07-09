package Collection_Framework;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class List {
    public static void main(String[] args) {
        // ArrayList<Integer> list=new ArrayList<>();
        // list.add(10);
        // list.add(20);
        // list.add(30);
        // System.out.println(list);
        // for (var num : list) {
        //     System.out.println(num);
        // }



        HashSet <Integer> hashSet=new HashSet<Integer>();
        hashSet.add(50);
        hashSet.add(20);
        hashSet.add(50);
        hashSet.add(5);
        
        
        System.out.println(hashSet);
        hashSet.remove(5);
        for (var num : hashSet) {    // Use for each loop
            System.out.println(num);
        }


 }
}
