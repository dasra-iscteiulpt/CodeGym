package com.codegym.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
One large array and two small ones

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int [] array=new int[20];
        for(int i=0; i<20;i++){
            int s = Integer.parseInt(br.readLine());
            array[i]=s;
        }
        int [] array2=new int[10];
        int [] array3=new int[10];

        for(int i=0; i<10;i++){
            array2[i]=array[i];
        }

        for(int i=10; i<20;i++){
            array3[i-10]=array[i];
        }

        for(int i=0; i<10;i++){
            System.out.println(array3[i]);
        }
    }
}
