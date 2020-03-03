package com.codegym.task.task19.task1908;

/* 
Picking out numbers

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String output = br.readLine();
        BufferedReader reader = new BufferedReader(new FileReader(input));
        BufferedWriter writer = new BufferedWriter(new FileWriter(output));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] line_split = line.split(" ");
            for(String s:line_split){
                if(isNumeric(s)){
                    writer.write(s + " ");
                }
            }
        }
        br.close();
        reader.close();
        writer.close();
    }
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
