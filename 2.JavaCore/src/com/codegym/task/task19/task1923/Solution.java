package com.codegym.task.task19.task1923;

/* 
Words with numbers

*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        String line;
        StringBuilder sb = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            String[] content=line.split(" ");
            for(String str:content) {
                char[] chars = str.toCharArray();
                for(char c : chars){
                    if(Character.isDigit(c)){
                        writer.write(str+ " ");
                        break;
                    }
                }
            }

        }
        reader.close();
        writer.close();
    }
}
