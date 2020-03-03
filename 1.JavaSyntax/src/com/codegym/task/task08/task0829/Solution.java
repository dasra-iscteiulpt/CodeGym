package com.codegym.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Software update

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // List of addresses
        Map<String,String> entry = new HashMap<>();
        while (true) {
            String city = reader.readLine();

            if (city.isEmpty()) break;
            String family = reader.readLine();
            entry.put(city,family);
        }
        //System.out.println("im here");
        String city2 = reader.readLine();

        //if (!city2.equals("") && entry.containsKey(city2)) {
            //entry.get(city2);
            System.out.println(entry.get(city2));
        //}
    }
}
