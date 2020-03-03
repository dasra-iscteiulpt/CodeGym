package com.codegym.task.task09.task0906;

/* 
Logging stack traces

*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        String nameOfCurrMethod =Thread.currentThread().getStackTrace()[2].getMethodName();
        String nameOfCurrClass =Thread.currentThread().getStackTrace()[2].getClassName();
        System.out.println(nameOfCurrClass + ": " + nameOfCurrMethod + ": " + s);
    }
}
