package com.codegym.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Expressing ourselves more concisely

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<String>();
        for(int i=0; i<5;i++){
            String s = br.readLine();
            strings.add(s);
        }
        String shortest=strings.get(0);
        for(int i=1; i<strings.size();i++){
            if(strings.get(i).length()<shortest.length()){
                shortest=strings.get(i);
            }
        }
        for(int i=0; i<strings.size();i++){
            if(strings.get(i).length()==shortest.length()){
                System.out.println(strings.get(i));
            }
        }
    }
}
