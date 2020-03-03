package com.codegym.task.task19.task1926;

/* 
Mirror image

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filename = br.readLine();
        br.close();
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = reader.readLine()) != null) {
            StringBuilder input1 = new StringBuilder();
            input1.append(line);
            // reverse StringBuilder input1
            input1 = input1.reverse();
            System.out.println(input1);

        }
        reader.close();
    }


}
