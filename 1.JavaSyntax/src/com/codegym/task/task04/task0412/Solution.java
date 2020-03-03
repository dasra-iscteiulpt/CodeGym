package com.codegym.task.task04.task0412;

/* 
Positive and negative numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        if(i>0) {
            System.out.println(i*=2);//write your code here

        }
        else if(i<0) {
            System.out.println(i+=1);//write your code here

        }
        else if(i==0) {
            System.out.println(i=0);//write your code here
        }
    }

}