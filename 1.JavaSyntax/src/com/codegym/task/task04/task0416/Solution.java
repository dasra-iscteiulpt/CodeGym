package com.codegym.task.task04.task0416;

/* 
Crossing the road blindly

*/

import java.io.*;
import java.nio.Buffer;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(br.readLine());
        //System.out.println(a);
        if(a%5 >= 0 && a%5 < 3)
            System.out.println("green");
        if(a%5 >= 3 && a%5 < 4)
            System.out.println("yellow");
        if(a%5 >= 4 && a%5 < 5)
            System.out.println("red");
    }
}