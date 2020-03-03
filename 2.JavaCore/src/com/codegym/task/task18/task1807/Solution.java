package com.codegym.task.task18.task1807;

/* 
Counting commas

*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filename = br.readLine();
        int aux = 0;
        FileInputStream inputstream = new FileInputStream(filename);
        while (inputstream.available() > 0) {
            int data = inputstream.read();
            if(data==44)
                aux++;
        }
        inputstream.close();
        br.close();
        System.out.println(aux);
    }
}
