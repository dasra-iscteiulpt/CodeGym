package com.codegym.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Shortest or longest

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<String>();
        for(int i=0; i<10;i++){
            String s = br.readLine();
            strings.add(s);
        }
        String shortest=strings.get(0);
        int s=0;
        String longest=strings.get(0);
        int l=0;
        for(int i=1; i<strings.size();i++){
            if(strings.get(i).length()>longest.length()){
                longest=strings.get(i);
                l=i;
            }
            if(strings.get(i).length()<shortest.length()){
                shortest=strings.get(i);
                s=i;
            }
        }
        if(l<s)
            System.out.println(longest);
        else
            System.out.println(shortest);

    }
}
