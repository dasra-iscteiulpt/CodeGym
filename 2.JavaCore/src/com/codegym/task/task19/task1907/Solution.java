package com.codegym.task.task19.task1907;

/* 
Counting words

*/


import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        br.close();
        FileReader reader = new FileReader(fileName);
        String s = "", word = "world";
        int count = 0;
        while (reader.ready()) {
            int data = reader.read();
            s += (char) data;
        }
        reader.close();
        Scanner scanner = new Scanner(s);
        scanner.useDelimiter("\\W");
        while (scanner.hasNext()){
            String data = scanner.next();
            if (data.equals(word)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
