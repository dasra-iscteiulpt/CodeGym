package com.codegym.task.task32.task3213;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/* 
Caesar cipher

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        StringReader reader = new StringReader("Khoor#Dpljr#&C,₷B'3");
        System.out.println(decode(reader, -3));  // Hello Amigo #@)₴?$0
    }

    public static String decode(StringReader reader, int key) throws IOException {
        StringWriter writer = new StringWriter();
        try {
            BufferedReader br = new BufferedReader(reader);
            String line;
            String s = "";
            // Read a string from the Reader.
            while ((line = br.readLine()) != null) {
                int len = line.length();
                for (int x = 0; x < len; x++) {
                    char c = (char) (line.charAt(x) + key);
                    if (c > 'z')
                        s += (char) (line.charAt(x) - (26 - key));
                    else
                        s += (char) (line.charAt(x) + key);
                }
                writer.write(s);
            }
        } catch (Exception e) {
            return new StringWriter().toString();
        }
        return writer.toString();
    }
}
