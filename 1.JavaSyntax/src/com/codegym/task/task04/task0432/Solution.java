package com.codegym.task.task04.task0432;



/* 
You can't have too much of a good thing

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br2.readLine();
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        int i1 = Integer.parseInt(br1.readLine());
        int count = 0;
        while(count < i1){
            System.out.println(s1);
            count++;
        }

    }
}
