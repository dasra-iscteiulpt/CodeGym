package com.codegym.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Shared last names and first names

*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        HashMap<String, String > people= new HashMap<String, String>();
        people.put("diana","salvador");
        people.put("diana","mendes");
        people.put("bruno","a");
        people.put("b","c");
        people.put("d","e");
        people.put("f","mendes");
        people.put("g","a");
        people.put("b","h");
        people.put("i","j");
        people.put("k","l");

        return people;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
