package com.codegym.task.task04.task0425;

/* 
Target locked!

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        int i1 = Integer.parseInt(br1.readLine());
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        int i2 = Integer.parseInt(br2.readLine());
        if(i1<0 && i2<0){
            System.out.println(3);
        }
        if(i1<0 && i2>0){
            System.out.println(2);
        }
        if(i1>0 && i2>0){
            System.out.println(1);
        }
        if(i1>0 && i2<0){
            System.out.println(4);
        }
    }
}
