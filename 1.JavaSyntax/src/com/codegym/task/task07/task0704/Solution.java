package com.codegym.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Flip the array

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int [] array=new int[10];
        for(int i=0; i<10;i++){
            int s = Integer.parseInt(br.readLine());
            array[i]=s;
        }
        for(int i=9; i>=0;i--){
            System.out.println(array[i]);
        }
    }
}

