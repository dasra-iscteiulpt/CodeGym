package com.codegym.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Ten cats

*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> map = new HashMap<String, Cat>();
        map.put("a",new Cat("a"));
        map.put("b",new Cat("b"));
        map.put("c",new Cat("c"));
        map.put("d",new Cat("d"));
        map.put("e",new Cat("e"));
        map.put("f",new Cat("f"));
        map.put("g",new Cat("g"));
        map.put("h",new Cat("h"));
        map.put("i",new Cat("i"));
        map.put("j",new Cat("j"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> mySet = new HashSet<Cat>();
        for(Cat cat:map.values()){
            mySet.add(cat);
        }
        return mySet;

    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
