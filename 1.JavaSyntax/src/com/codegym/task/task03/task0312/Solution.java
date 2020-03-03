package com.codegym.task.task03.task0312;

/* 
Time conversion

*/

public class Solution {
    //write your code here

    public static void main(String[] args) {
        System.out.println(convertToSeconds(3));
        System.out.println(convertToSeconds(16));//write your code here
    }

    public static int convertToSeconds(int hour){
       int sec = hour*3600;
       return sec;
    }
}
