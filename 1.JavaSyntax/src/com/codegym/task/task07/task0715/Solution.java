package com.codegym.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
More Sam-I-Am

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Sam"); // 0
        list.add("I"); // 1
        list.add("Am"); // 2
        for (int i=0;i<list.size();i++) {
                list.add(i+1,"Ham");
                i++;
        }
        for (int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
    }
}
