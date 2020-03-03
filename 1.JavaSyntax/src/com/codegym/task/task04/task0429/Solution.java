package com.codegym.task.task04.task0429;

/* 
Positive and negative numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        int i1 = Integer.parseInt(br1.readLine());
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        int i2 = Integer.parseInt(br2.readLine());
        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
        int i3 = Integer.parseInt(br3.readLine());
        int count1=0, count2=0;
        if(i1>0){
            count1++;
        }
        if(i1<0){
            count2++;
        }
        if(i2>0){
            count1++;
        }
        if(i2<0){
            count2++;
        }
        if(i3>0){
            count1++;
        }
        if(i3<0){
            count2++;
        }
        System.out.println("Number of negative numbers: "+count2);
        System.out.println("Number of positive numbers: "+count1);
    }
}
