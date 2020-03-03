package com.codegym.task.task07.task0716;

import java.util.ArrayList;
import java.util.Collections;

/* 
R or L

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("rose"); // 0
        list.add("measure"); // 1
        list.add("love"); // 2
        list.add("lyre"); // 1
        list.add("wade"); // 2
        list.add("bark"); // 2

        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        ArrayList<Integer> aux = new ArrayList<Integer>();
        for (int i=0;i<list.size();) {
           if (list.get(i).contains("r")&& !list.get(i).contains("l")) {
                list.remove(i);
                i=0;
            }
           else{
               i++;
           }
        }
        for (int i=0;i<list.size();i++) {
            if (list.get(i).contains("l") && !list.get(i).contains("r")) {
                 list.add(i,list.get(i));
                 i++;
             }
        }
        return list;
    }
}