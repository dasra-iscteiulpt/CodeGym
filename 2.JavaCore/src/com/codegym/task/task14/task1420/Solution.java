package com.codegym.task.task14.task1420;

/* 
GCD

*/


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();

        if (!validate(s1,s2)) throw new Exception("Input is not a positive Int");
        Integer i1 = Integer.parseInt(s1);
        Integer i2 = Integer.parseInt(s2);

        int gcd = 1;
        for (int i = 1; i <= i1 && i <= i2; i++) {
            if (i1 % i == 0 && i2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println(gcd);
    }

    public static boolean validate(String s1, String s2) {
        try {
            Integer i1 = Integer.parseInt(s1);
            Integer i2 = Integer.parseInt(s2);
            if (i1 > 0 && i2 > 0) {
                return true;
            } else
                return false;
        } catch (Exception e) {
            return false;
        }
    }
}

