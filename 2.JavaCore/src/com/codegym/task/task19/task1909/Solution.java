package com.codegym.task.task19.task1909;

/* 
Changing punctuation marks

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String output = br.readLine();
        br.close();
        BufferedReader reader = new BufferedReader(new FileReader(input));
        BufferedWriter writer = new BufferedWriter(new FileWriter(output));
        int i = 0;
        while (reader.ready()) {
            int data = reader.read();
            if ((char) data == '.') {
                writer.write('!');
            } else {
                writer.write(data);
            }
        }
        reader.close();
        writer.close();
    }
}
