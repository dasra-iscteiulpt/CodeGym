package com.codegym.task.task18.task1809;

/* 
Reversing a file

*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filename = br.readLine();
        String filename2 = br.readLine();
        int aux = 0;
        FileInputStream inputstream1 = new FileInputStream(filename);
        FileOutputStream outputstream1 = new FileOutputStream(filename2);
        int size = inputstream1.available();
        int[] arr=new int[size];
        while (inputstream1.available() > 0) {
            int data = inputstream1.read();
            arr[size-1]=data;
            size--;
        }
        for (int i : arr)
            outputstream1.write(i);

        br.close();
        inputstream1.close();
        outputstream1.close();
    }
}
