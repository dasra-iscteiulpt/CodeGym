package com.codegym.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Searching for the right lines

*/

public class Solution {
    public static List<String> words = new ArrayList<>();

    static {
        words.add("A");
        words.add("B");
        words.add("C");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filename = br.readLine();
        br.close();
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        int strCounter = 0;
        while ((line = reader.readLine()) != null) {
            String[] content = line.split(" ");
            for (String str : content) {
                if (words.contains(str)) {
                    strCounter++;
                }

            }
            if (strCounter == 2)
                System.out.println(line);
            strCounter=0;
        }

        reader.close();
    }
}
