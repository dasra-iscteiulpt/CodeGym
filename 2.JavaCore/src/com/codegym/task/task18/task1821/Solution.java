package com.codegym.task.task18.task1821;

/* 
Symbol frequency

*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        FileInputStream inputStream1 = null;
        int i=0;
        TreeMap<Integer, Integer> sorted = new TreeMap<>();
        HashMap<Integer, Integer> hash = new HashMap<>();
        try {
            inputStream1 = new FileInputStream(args[0]);
            ArrayList<Integer> b = new ArrayList<Integer>();
            while (inputStream1.available() > 0) {
                int data = inputStream1.read();
                b.add(data);
            }
            for (Integer bytes : b) {
                if (!hash.keySet().contains(bytes)) {
                    int count = Collections.frequency(b, bytes);
                    hash.put(bytes, count);
                    //System.out.println(bytes + " frequency: " + count);
                }
            }

            sorted.putAll(hash);

            for (Map.Entry<Integer, Integer> entry : sorted.entrySet()) {
                i = entry.getKey();
                System.out.println((char)i + " " + entry.getValue());
            }

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            try {
                if (inputStream1 != null)
                    inputStream1.close();

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
