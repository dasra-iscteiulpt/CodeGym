package com.codegym.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Words in reverse

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<String>();
        for(int i=0; i<5;i++){
            String s = br.readLine();
            strings.add(s);
        }
        strings.remove(2);
        for(int i=strings.size()-1; i>=0;i--){
            System.out.println(strings.get(i));
        }
    }
}


