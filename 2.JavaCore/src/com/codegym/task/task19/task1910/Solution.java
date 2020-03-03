package com.codegym.task.task19.task1910;

/* 
Punctuation

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
            if ((Character.isLetterOrDigit((char) data))||(char) data==' ') {
                writer.write(data);
            }

        }
        reader.close();
        writer.close();
    }
}
