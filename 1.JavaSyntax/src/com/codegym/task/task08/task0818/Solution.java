package com.codegym.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Only for the rich

*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String,Integer> names = new HashMap<String,Integer>();
        names.put("Diana",300);
        names.put("Bruno",600);
        names.put("Joao",1000);
        names.put("Leticia",250);
        names.put("Pedro",100);
        names.put("Tome",300);
        names.put("Mafalda",600);
        names.put("Benedita",1200);
        names.put("Sao",900);
        names.put("Magda",800);
        return names;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> copy = new HashMap<String, Integer>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue()<500)
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}