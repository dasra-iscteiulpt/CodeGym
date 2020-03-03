package com.codegym.task.task04.task0436;


/* 
Drawing a rectangle

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        int i1 = Integer.parseInt(br1.readLine());
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        int i2 = Integer.parseInt(br2.readLine());
        for(int i=0;i<i1;i++){
            for(int j=0;j<i2;j++){
                System.out.print("8");
            }
            System.out.println();
        }

    }
}
