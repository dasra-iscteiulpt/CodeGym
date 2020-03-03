package com.codegym.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
String array in reverse order

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String [] array=new String[10];
        for(int i=0; i<8;i++){
            String s = br.readLine();
            array[i]=s;
        }
        for(int i=9; i>=0;i--){
            System.out.println(array[i]);
        }
    }
}