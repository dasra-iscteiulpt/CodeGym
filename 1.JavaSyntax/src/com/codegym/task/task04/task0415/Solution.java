package com.codegym.task.task04.task0415;

/* 
Rule of the triangle

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l1 = Integer.parseInt(br.readLine());
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        int l2 = Integer.parseInt(br.readLine());
        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
        int l3 = Integer.parseInt(br.readLine());
        if((l1>=l2+l3) || l2>=(l1+l3) || l3>=(l1+l2)){
            System.out.println("The triangle is not possible.");
        }
        else{
            System.out.println("The triangle is possible.");
        }
    }
}