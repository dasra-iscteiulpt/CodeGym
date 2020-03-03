package com.codegym.task.task19.task1906;

/* 
Even characters

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String output = br.readLine();
        br.close();
        FileReader reader = new FileReader(input);
        FileWriter writer = new FileWriter(output);
        int i=0;
        while (reader.ready()) {
            i++; // increment counter after every read operation
            int data = reader.read();
            if(i%2==0) {
                writer.write(data);
            }
        }
        reader.close();
        writer.close();

    }
}
