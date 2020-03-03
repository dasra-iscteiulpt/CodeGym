package com.codegym.task.task03.task0304;

/* 
Task with percentages

*/

public class Solution {
    public static double addTenPercent(int i) {
        double x = i+(i*0.1);//write your code here
        return x;
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}
