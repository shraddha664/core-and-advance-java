package org.example.collections_and_generics;

import java.util.*;

public class GenericsDemo {
    //Set Interface
    public static void main(String[] args) {
        int count[] = { 3,2, 4, 5, 6, 7};
        Set<Integer> set = new HashSet<>();
        try {
            for (int i = 0; i <= 5; i++) {
                set.add(count[i]);
            }
            System.out.println(set);

            TreeSet<Integer> sortedSet = new TreeSet<Integer>(set);
            System.out.println("the sorted lst is : " + sortedSet);

            System.out.println("First element of the set is:" + (Integer) sortedSet.first());
            System.out.println("last element of the set is: " + (Integer) sortedSet.last());
        } catch (Exception e) {

        }

    }
}
