package com.codegym.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Sorting bytes

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> input = new ArrayList<Integer>();
        ArrayList<Integer> al = new ArrayList<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filename = br.readLine();
        int aux = 0;
        FileInputStream inputstream = new FileInputStream(filename);
        while (inputstream.available() > 0) {
            int data = inputstream.read();
            input.add(data);
        }
        inputstream.close();
        br.close();
        Collections.sort(input);

       for(Integer i:input){
            if (!al.contains(i)) {
                al.add(i);
            }
        }
        for(Integer i:al)
            System.out.print(i + " ");
    }

}
