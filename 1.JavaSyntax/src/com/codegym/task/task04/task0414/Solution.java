package com.codegym.task.task04.task0414;

/* 
Number of days in the year

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        int aux=i;
        int count=0;
        if(aux%400==0) {
            System.out.println("Number of days in the year: " + 366);

        }
        else if(aux%100==0){
            System.out.println("Number of days in the year: " + 365);
        }
        else if(aux%4==0){
            System.out.println("Number of days in the year: " + 366);
            ++count;
        }
        else{
            System.out.println("Number of days in the year: " + 365);
        }

    }
}