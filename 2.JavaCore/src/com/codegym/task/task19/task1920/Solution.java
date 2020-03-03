package com.codegym.task.task19.task1920;

/* 
The richest

*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        HashMap<String, Double> map = new HashMap<String, Double>();
        String line;
        while ((line = br.readLine()) != null) {
            String[] content = line.split(" ");
            if (!map.containsKey(content[0])) {
                map.put(content[0], Double.parseDouble(content[1]));
            } else {
                double d = map.get(content[0]);
                map.replace(content[0], d + Double.parseDouble(content[1]));
            }
        }
        br.close();
        TreeMap<String, Double> sorted = new TreeMap<>(map);
        double maxValueInMap=(Collections.max(sorted.values()));
        Iterator hmIterator = sorted.entrySet().iterator();
        while (hmIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry) hmIterator.next();
            if(mapElement.getValue().equals(maxValueInMap))
                System.out.println(mapElement.getKey());
        }
    }
}
