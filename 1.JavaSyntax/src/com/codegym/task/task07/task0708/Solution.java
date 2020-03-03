package com.codegym.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Longest string

*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<String>();
        for(int i=0; i<5;i++){
            String s = br.readLine();
            strings.add(s);
        }
        String s=strings.get(0);
        for(int i=1; i<5;i++){
            if(strings.get(i).length()>s.length()){
                s=strings.get(i);
            }
        }
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == s.length())
                System.out.println(strings.get(i));
        }
    }
}
