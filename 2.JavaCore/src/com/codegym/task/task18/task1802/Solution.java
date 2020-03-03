package com.codegym.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Minimum byte

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filename = br.readLine();
        FileInputStream inputstream = new FileInputStream(filename);
        int data = inputstream.read();
        int b = data;
        data = inputstream.read();
        while (inputstream.available() > 0) {
            data = inputstream.read();
            if (data < b) {
                b = data;
            }
        }
        br.close();
        inputstream.close();
        System.out.println(b);
    }
}

