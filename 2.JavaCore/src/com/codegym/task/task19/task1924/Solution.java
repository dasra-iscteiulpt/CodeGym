package com.codegym.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Replacing numbers

*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "zero");
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");
        map.put(10, "ten");
        map.put(11, "eleven");
        map.put(12, "twelve");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        reader.close();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line, year = "", month = "", day = "", name = "";
        StringBuilder sb = new StringBuilder();
        while ((line = br.readLine()) != null) {
            String[] content = line.split(" ");
            for (String str : content) {
                if (isNumeric(str)) {
                    int i = Integer.parseInt(str);
                    if (map.containsKey(i))
                        sb.append(map.get(i)+" ");
                    else
                        sb.append(i+" ");
                } else {
                    sb.append(str+ " ");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
