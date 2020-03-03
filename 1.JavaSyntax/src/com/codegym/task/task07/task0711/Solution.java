package com.codegym.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Remove and insert

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<String>();
        for(int i=0; i<5;i++){
            String s = br.readLine();
            strings.add(s);
        }
        String s=null;
        for(int i=0; i<13;i++){
            s=strings.get(strings.size()-1);
            strings.remove(strings.size()-1);
            strings.add(0,s);
        }
        for(int i=0; i<strings.size();i++){
            System.out.println(strings.get(i));
        }
    }
}
