package com.codegym.task.task04.task0442;


/* 
Adding

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        int aux=0;
        while (true) {
            int i1 = Integer.parseInt(br1.readLine());
            aux+=i1;
            if (i1== -1)
            break;
        }
        System.out.println(aux);
    }
}
