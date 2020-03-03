package com.codegym.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/* 
Maximum byte

*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String filename=br.readLine();
        FileInputStream inputstream = new FileInputStream(filename);
        int b=0;

        while(inputstream.available() > 0) {
            int data = inputstream.read();
            if(data>b){
                b=data;
            }
        }
        br.close();
        inputstream.close();
        System.out.println(b);
    }
}
