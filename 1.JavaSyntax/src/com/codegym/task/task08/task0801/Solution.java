package com.codegym.task.task08.task0801;

/* 
HashSet of plants

*/

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashSet<String> map = new HashSet<String>();
        map.add("watermelon");
        map.add("banana");
        map.add("cherry");
        map.add("pear");
        map.add("cantaloupe");
        map.add("blackberry");
        map.add("ginseng");
        map.add("strawberry");
        map.add("iris");
        map.add("potato");

        for (String text : map)
        {
            System.out.println(text);
        }

    }
}
