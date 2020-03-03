package com.codegym.task.task09.task0912;

/* 
Exception when working with numbers

*/

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here


        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        }
        catch (NumberFormatException e){
            System.out.println("NumberFormatException");
        }
        //write your code here
    }
}
