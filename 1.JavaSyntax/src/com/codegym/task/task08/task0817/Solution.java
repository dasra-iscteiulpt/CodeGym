package com.codegym.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
We don't need repeats

*/

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

    public static void removeFirstNameDuplicates(Map<String, String> map) {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        for (String s : map.values()) {
            if(!list.contains(s)){
                list.add(s);
            }
            else{
                list2.add(s);
            }

        }
        for(String j : list2){
            removeItemFromMapByValue(map, j);
        }
    }


    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
