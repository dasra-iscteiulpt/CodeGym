package com.codegym.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Greater than 10? You're not a good fit for us

*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> mySet = new HashSet<Integer>();
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(4);
        mySet.add(5);
        mySet.add(6);
        mySet.add(7);
        mySet.add(8);
        mySet.add(9);
        mySet.add(10);
        mySet.add(11);
        mySet.add(12);
        mySet.add(13);
        mySet.add(14);
        mySet.add(15);
        mySet.add(16);
        mySet.add(17);
        mySet.add(18);
        mySet.add(19);
        mySet.add(20);
        return mySet;

    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            if(it.next()>10)
                it.remove();
        }
        return set;
    }

    public static void main(String[] args) {

    }
}
