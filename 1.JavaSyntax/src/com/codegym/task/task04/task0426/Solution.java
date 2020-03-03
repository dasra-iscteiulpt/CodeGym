package com.codegym.task.task04.task0426;

/* 
Labels and numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        int i1 = Integer.parseInt(br1.readLine());
        if(i1==0)
            System.out.println("Zero");
        if(i1%2==0 && i1>0) {
            System.out.println("Positive even number");
        }
        if(i1%2==0 && i1<0) {
            System.out.println("Negative even number");
        }
        if(i1%2!=0 && i1>0) {
            System.out.println("Positive odd number");
        }
        if(i1%2!=0 && i1<0) {
            System.out.println("Negative odd number");
        }
    }
}
