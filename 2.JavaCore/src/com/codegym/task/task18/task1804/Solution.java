package com.codegym.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Rarest bytes

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> input = new ArrayList<Integer>();
        ArrayList<Integer> al = new ArrayList<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
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

        for (Integer i1 : input) {
            for (Integer i2 : input) {
                if (i2 == i1) {
                    aux++;
                }
            }
            map.put(i1, aux);
            aux = 0;
        }
        int i = Collections.min(map.values());
        for (Map.Entry<Integer, Integer> set : map.entrySet()) {
            if (set.getValue() == i && !al.contains(set.getKey())) {
                System.out.print(set.getKey() + " ");
            }
        }
    }
}
