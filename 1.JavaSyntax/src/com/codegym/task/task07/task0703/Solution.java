package com.codegym.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Lonely arrays interact

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String [] array=new String[10];
        int [] arrayInt=new int[10];
        for(int i=0; i<10;i++){
            String s = br.readLine();
            array[i]=s;
            arrayInt[i]=array[i].length();
            //System.out.println(arrayInt[i]);
        }

        for(int i=0; i<10;i++){
            System.out.println(arrayInt[i]);
        }
    }
}
