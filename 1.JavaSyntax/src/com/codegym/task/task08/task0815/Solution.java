package com.codegym.task.task08.task0815;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* 
Census

*/

/*public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Sim", "salvador");
        map.put("Tom", "salvador");
        map.put("Arbus", "mendes");
        map.put("Baby", "a");
        map.put("Cat", "b");
        map.put("Diana", "c");
        map.put("Bruno", "d");
        map.put("Banana", "f");
        map.put("Pear", "mendes");
        map.put("x", "salvador");
        return map;
    }

    public static int getSameFirstNameCount(HashMap<String, String> map, String name) {
        int count=0;
        for (HashMap.Entry<String,String> pair :map.entrySet())
        {
            if(pair.getKey().equals(name))
                count++;
        }
            return count;
    }

    public static int getSameLastNameCount(HashMap<String, String> map, String lastName) {
        int count=0;
        for (HashMap.Entry<String,String> pair :map.entrySet())
        {
            if(pair.getValue().equals(lastName))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}*/

public class Solution {
    public static HashMap<String, String> createMap() {
         HashMap<String,String> names = new HashMap<String, String>();
        names.put("Taylorr","Andrea");
        names.put("Markley","Phil");
        names.put("Taylor","Rosanna");
        names.put("Williamsr","Andrea");
        names.put("Williams","Laverne");
        names.put("Taylorq","Andrea");
        names.put("Taylora","Dan");
        names.put("Golovko","Steve");
        names.put("Cuff","Michele");
        names.put("Brady","Keith");

        return names;

    }

    public static int getSameFirstNameCount(HashMap<String, String> map, String name) {
       int firstNameCount = 0;

        for (HashMap.Entry<String, String> namePair : map.entrySet()) {
            if (namePair.getValue().equalsIgnoreCase(name))
                firstNameCount++;
        }

        return firstNameCount;
    }

    public static int getSameLastNameCount(HashMap<String, String> map, String lastName) {
        int lastNameCount = 0;
        for (HashMap.Entry<String, String> namePair : map.entrySet()) {
            if (namePair.getKey().equalsIgnoreCase(lastName))
                lastNameCount++;
        }

        return lastNameCount;

    }

    public static void main(String[] args) {

    }
}

