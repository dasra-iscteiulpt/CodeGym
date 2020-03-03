package com.codegym.task.task19.task1925;

/* 
Long words

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        String line;
        int count = 0;
        while ((line = reader.readLine()) != null) {
            String[] content = line.split(" ");
            for (String str : content) {
                if (str.length() > 6) {
                    if (count == 0) {
                        writer.write(str);
                        count++;
                    } else
                        writer.write("," + str);
                }
            }
        }
        reader.close();
        writer.close();
    }
}
