package com.codegym.task.task04.task0421;

/* 
Jen or Jen?

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br1.readLine();

        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        String s2 = br2.readLine();
        if(s2.equals(s1)){
            System.out.println("The names are identical");
        }
        else if(s2.length()==s1.length()){
            System.out.println("The names are the same length");
        }
    }
}
